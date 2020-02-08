package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.DescricaoTipoDao;
import gov.amc.siga.model.DescricaoTipo;

@Repository
public class DescricaoTipoDaoImplementacao implements DescricaoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	private static final String QUERY = "SELECT descricao_cod, descricao_desc FROM siga.descricao_tipo";

	public DescricaoTipoDaoImplementacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarDescricaoTipo(DescricaoTipo descricaoTipo) {
		log.info("Salvando tipo de descrição..." + descricaoTipo.getDescricaoCodigo());
		final String sql = "INSERT INTO siga.descricao_tipo (descricao_cod, descricao_desc) VALUES( ?, ?)";
		template.update(sql, descricaoTipo.getDescricaoCodigo(), descricaoTipo.getDescricaoDescricao());
	}

	@Override
	public void atualizarCodigoDescricaoTipo(DescricaoTipo descricaoTipo) {
		log.info("Atualizando Código...");
		final String sql = "UPDATE siga.descricao_tipo SET descricao_cod= ? WHERE descricao_cod= ?";
		template.update(sql, descricaoTipo.getDescricaoCodigo(), descricaoTipo.getDescricaoDescricao(),
				descricaoTipo.getDescricaoCodigo());
	}

	@Override
	public void atualizarDescricaoDescricaoTipo(DescricaoTipo descricaoTipo) {
		log.info("Atualizando descrição...");
		final String sql = "UPDATE siga.descricao_tipo SET descricao_desc=? WHERE descricao_cod= ?";
		template.update(sql, descricaoTipo.getDescricaoCodigo(), descricaoTipo.getDescricaoCodigo());

	}

	@Override
	public void deletarDescricaoTipo(DescricaoTipo descricaoTipo) {
		log.info("Deletando tipo de descrição...");
		final String sql = "DELETE FROM siga.descricao_tipo WHERE descricao_id=?";
		template.update(sql, descricaoTipo.getDescricaoCodigo());
	}

	@Override
	public List<DescricaoTipo> listarTodasDescricoesTipos() {
		return template.query(QUERY, this::descricoesMapRow);
	}

	private DescricaoTipo descricoesMapRow(ResultSet rs, int numRow) throws SQLException {
		return new DescricaoTipo(rs.getString("descricao_cod"), rs.getString("descricao_desc"));
	}

}
