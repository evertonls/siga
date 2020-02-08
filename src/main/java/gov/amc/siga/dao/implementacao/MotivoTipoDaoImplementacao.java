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

import gov.amc.siga.dao.interfaces.MotivoTipoDao;
import gov.amc.siga.model.MotivoTipo;

@Repository
public class MotivoTipoDaoImplementacao implements MotivoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());
	private static final String QUERY = "SELECT motivo_cod, motivo_desc FROM siga.motivo_tipo";

	public MotivoTipoDaoImplementacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarMotivoTipo(MotivoTipo motivoTipo) {
		log.info("Salvando motivo...");
		final String sql = "INSERT INTO siga.motivo_tipo (motivo_cod, motivo_desc) VALUES(?, ?)";
		template.update(sql, motivoTipo.getMotivoCodigo(), motivoTipo.getMotivoDescricao());
	}

	@Override
	public void atualizarCodigoMotivoTipo(MotivoTipo motivoTipo) {
		log.info("Atualizando motivo..");
		final String sql = "UPDATE siga.motivo_tipo SET motivo_cod=? WHERE motivo_cod=?";
		template.update(sql, motivoTipo.getMotivoCodigo(), motivoTipo.getMotivoCodigo());
	}

	@Override
	public void atualizarDescricaoMotivoTipo(MotivoTipo motivoTipo) {
		log.info("Atualizando motivo..");
		final String sql = "UPDATE siga.motivo_tipo SET motivo_desc=? WHERE motivo_cod=?";
		template.update(sql, motivoTipo.getMotivoDescricao(), motivoTipo.getMotivoCodigo());
	}

	@Override
	public void deletarMotivoTipo(MotivoTipo motivoTipo) {
		log.info("Deletando motivo...");
		final String sql = "DELETE FROM siga.motivo_tipo WHERE motivo_cod=?";
		template.update(sql, motivoTipo.getMotivoCodigo());
	}

	@Override
	public List<MotivoTipo> listarTodosMotivosTipos() {
		return template.query(QUERY, this::motivoTipoMapRow);
	}

	private MotivoTipo motivoTipoMapRow(ResultSet rs, int numRow) throws SQLException {
		return new MotivoTipo(rs.getString("motivo_cod"), rs.getString("motivo_desc"));
	}

}
