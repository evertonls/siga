package gov.amc.siga.daos.templates;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.daos.interfaces.AutorizacaoDAO;
import gov.amc.siga.models.Autorizacao;
import gov.amc.siga.models.Usuario;

@Repository
public class AutorizacaoJDBCTemplate implements AutorizacaoDAO, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;

	public AutorizacaoJDBCTemplate(DataSource ds) {
		super();
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public List<Autorizacao> getAutorizacoesFromUserId(Long id) {
		String sqlRoles = "SELECT autoriza_cod, autoriza_desc FROM permissoes where usuario_id = ?";
		List<Autorizacao> roles = template.query(sqlRoles, this::mapRowPapel, id);

		return roles;
	}

	@Override
	public List<Autorizacao> getAutorizacoesFromUserCPF(String cpf) {
		String sqlRoles = "SELECT autoriza_cod, autoriza_desc FROM permissoes "
				+ "WHERE usuario_id = ( SELECT usuario_id FROM usuarios WHERE cpf_num = ?)";

		List<Autorizacao> roles = template.query(sqlRoles, this::mapRowPapel, cpf);

		return roles;
	}

	@Override
	public List<Autorizacao> getAll() {
		String sql = "SELECT * FROM autorizacoes";

		List<Autorizacao> roles = template.query(sql, this::mapRowPapel);

		return roles;
	}

	@Override
	public void persistRoles(Usuario usuario) {
		final String sql = "INSERT INTO permissoes (usuario_id, autoriza_cod) VALUES (?, ?)";

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
