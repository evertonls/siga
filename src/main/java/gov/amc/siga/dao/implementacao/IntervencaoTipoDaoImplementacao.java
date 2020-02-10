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

import gov.amc.siga.dao.interfaces.IntervencaoTipoDao;
import gov.amc.siga.model.IntervencaoTipo;

@Repository
public class IntervencaoTipoDaoImplementacao implements IntervencaoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	private static final String QUERY = "SELECT intervencao_cod, intervenca_desc FROM siga.intervencao_tipo";

	public IntervencaoTipoDaoImplementacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarIntervencaoTipo(IntervencaoTipo intervencaoTipo) {
		log.info("");
		final String sql = "INSERT INTO siga.intervencao_tipo (intervencao_cod, intervenca_desc) VALUES(?, ?)";
		template.update(sql, intervencaoTipo.getIntervencaoCodigo(), intervencaoTipo.getIntervencaoDescricao());
	}

	@Override
	public void atualizarCodigoIntervencaoTipo(IntervencaoTipo intervencaoTipo) {
		log.info("");
		final String sql = "UPDATE siga.intervencao_tipo SET intervenca_cod=? WHERE intervencao_cod=?";
		template.update(sql, intervencaoTipo.getIntervencaoCodigo(), intervencaoTipo.getIntervencaoCodigo());
	}

	@Override
	public void atualizarDescricaoIntervencaoTipo(IntervencaoTipo intervencaoTipo) {
		log.info("");
		final String sql = "UPDATE siga.intervencao_tipo SET intervenca_desc=? WHERE intervencao_cod=?";
		template.update(sql, intervencaoTipo.getIntervencaoCodigo(), intervencaoTipo.getIntervencaoDescricao());

	}

	@Override
	public void deletarIntervencaoTipo(IntervencaoTipo intervencaoTipo) {
		log.info("");
		final String sql = "DELETE FROM siga.intervencao_tipo WHERE intervencao_cod=?";
		template.update(sql, intervencaoTipo.getIntervencaoCodigo());
	}

	@Override
	public List<IntervencaoTipo> listarTodasIntervencoes() {
		return template.query(QUERY, this::intervencaoTipoRowMap);
	}

	private IntervencaoTipo intervencaoTipoRowMap(ResultSet rs, int numRow) throws SQLException {
		return new IntervencaoTipo(rs.getString("intervencao_cod"), rs.getString("intervencao_cod"));
	}

}
