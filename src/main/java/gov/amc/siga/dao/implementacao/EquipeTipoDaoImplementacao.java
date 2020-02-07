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

import gov.amc.siga.dao.interfaces.EquipeTipoDao;
import gov.amc.siga.model.EquipeTipo;

@Repository
public class EquipeTipoDaoImplementacao implements EquipeTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	private static final String QUERY = "SELECT equipe_cod, equipe_desc FROM siga.equipe_tipo";
	
	
	public EquipeTipoDaoImplementacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarEquipeTipo(EquipeTipo equipeTipo) {
		log.info("Salvando novo tipo de equipe. " + equipeTipo.getEquipeCodigo());
		final String sql = "INSERT INTO siga.equipe_tipo (equipe_cod, equipe_desc) VALUES(?, ?)";
		template.update(sql, equipeTipo.getEquipeCodigo(), equipeTipo.getEquipeDescricao());
	}

	@Override
	public void atualizarCodigoEquipeTipo(EquipeTipo equipeTipo) {
		log.info("Atualizando codigo de equipe..." + equipeTipo.getEquipeCodigo());
		final String sql = "UPDATE siga.equipe_tipo SET equipe_cod=? WHERE equipe_cod=?";
		template.update(sql, equipeTipo.getEquipeCodigo(), equipeTipo.getEquipeCodigo());
	}

	@Override
	public void atualizarDescricaoEquipeTipo(EquipeTipo equipeTipo) {
		log.info("Atualizando descrição de equipe..." + equipeTipo.getEquipeDescricao());
		final String sql = "UPDATE siga.equipe_tipo SET equipe_desc=? WHERE equipe_cod=?";
		template.update(sql, equipeTipo.getEquipeDescricao(), equipeTipo.getEquipeCodigo());
	}

	@Override
	public void deletarEquipeCodigo(EquipeTipo equipeTipo) {
		log.info("Deletando tipo de equipe..." + equipeTipo.getEquipeCodigo());
		final String sql = "DELETE FROM siga.equipe_tipo WHERE equipe_cod=?";
		template.update(sql, equipeTipo.getEquipeCodigo());
	}

	@Override
	public List<EquipeTipo> listarTodasEquipesTipo() {
		return template.query(QUERY, this::equipeTipoMapRow);
	}

	private EquipeTipo equipeTipoMapRow(ResultSet rs, int numRow) throws SQLException {
		return new EquipeTipo(rs.getString("equipe_cod"), rs.getString("equipe_desc"));
	}

}
