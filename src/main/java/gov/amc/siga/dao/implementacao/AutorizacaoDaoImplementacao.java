package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.AutorizacaoDao;
import gov.amc.siga.model.Autorizacao;
import gov.amc.siga.model.Usuario;

@Repository
public class AutorizacaoDaoImplementacao implements AutorizacaoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;

	public AutorizacaoDaoImplementacao(DataSource ds) {
		super();
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public List<Autorizacao> getAutorizacoesFromUserId(Long id) {
		String sqlRoles = "SELECT autoriza_cod, autoriza_desc FROM permissao where usuario_id = ?";
		List<Autorizacao> roles = template.query(sqlRoles, this::mapRowPapel, id);

		return roles;
	}

	@Override
	public List<Autorizacao> getAutorizacoesFromUserCPF(String cpf) {
		String sqlRoles = "SELECT autoriza_cod, autoriza_desc FROM permissao "
				+ "WHERE usuario_id = ( SELECT usuario_id FROM usuario WHERE cpf_num = ?)";

		List<Autorizacao> roles = template.query(sqlRoles, this::mapRowPapel, cpf);

		return roles;
	}

	@Override
	public List<Autorizacao> getAll() {
		String sql = "SELECT * FROM autorizacao";

		List<Autorizacao> roles = template.query(sql, this::mapRowPapel);

		return roles;
	}

	@Override
	public void persistRoles(Usuario usuario) {
		final String sql = "INSERT INTO permissao (usuario_id, autoriza_cod) VALUES (?, ?)";

		template.batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setLong(1, usuario.getId());
				ps.setString(2, usuario.getRoles().get(i).getAuthority());
			}

			@Override
			public int getBatchSize() {
				return usuario.getRoles().size();
			}
		});
	}

	private Autorizacao mapRowPapel(ResultSet rs, int rowNum) throws SQLException {

		return new Autorizacao(rs.getString("autoriza_cod"), rs.getString("autoriza_desc"));

	}

}
