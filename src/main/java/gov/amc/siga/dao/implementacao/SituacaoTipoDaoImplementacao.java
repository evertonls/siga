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

import gov.amc.siga.dao.interfaces.SituacaoTipoDao;
import gov.amc.siga.model.SituacaoTipo;

@Repository
public class SituacaoTipoDaoImplementacao implements SituacaoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());
	private static final String QUERY = "SELECT situacao_cod, situacao_desc FROM siga.situacao_tipo";

	public SituacaoTipoDaoImplementacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarSituacaoTipo(SituacaoTipo situacaoTipo) {
		log.info("");
		final String sql = "INSERT INTO siga.situacao_tipo (situacao_cod, situacao_desc) VALUES(?, ?)";
		template.update(sql, situacaoTipo.getSituacaoCodigo(), situacaoTipo.getSituacaoDescricao());
	}

	@Override
	public void atualizarCodigoSituacaoTipo(SituacaoTipo situacaoTipo) {
		log.info("");
		final String sql = "UPDATE siga.situacao_tipo SET situacao_cod= ? WHERE situacao_cod=?";
		template.update(sql, situacaoTipo.getSituacaoCodigo(), situacaoTipo.getSituacaoCodigo());
	}

	@Override
	public void atualizarDescricaoSituacaoTipo(SituacaoTipo situacaoTipo) {
		log.info("");
		final String sql = "UPDATE siga.situacao_tipo SET situacao_desc= ? WHERE situacao_cod=?";
		template.update(sql, situacaoTipo.getSituacaoDescricao(), situacaoTipo.getSituacaoCodigo());
	}

	@Override
	public void deletarSituacaoTipo(SituacaoTipo situacaoTipo) {
		log.info("");
		final String sql = "DELETE FROM siga.situacao_tipo WHERE situacao_cod = ?";
		template.update(sql, situacaoTipo.getSituacaoCodigo());
	}

	@Override
	public List<SituacaoTipo> listarTodasSituacoesTipos() {
		return template.query(QUERY, this::situacaoTipoMapRow);
	}
	
	private SituacaoTipo situacaoTipoMapRow(ResultSet rs, int numRow) throws SQLException{
		return new SituacaoTipo(rs.getString("situacao_cod"), rs.getString("situacao_desc"));
	}

}
