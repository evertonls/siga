package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.EquipeTipoDao;
import gov.amc.siga.model.EquipeTipo;

@Repository
public class EquipeTipoDaoImplementacao implements EquipeTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	private JdbcTemplate template;
	
	private final String listar = "SELECT equipe_cod, equipe_desc FROM siga.equipe_tipo";

	@Override
	public void setDataSurce(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarEquipeTipo(EquipeTipo equipeTipo) {
		final String salvar = "INSERT INTO siga.equipe_tipo (equipe_cod, equipe_desc) VALUES(?, ?)";
		template.update(salvar, equipeTipo.getEquipeCodigo(), equipeTipo.getEquipeDescricao());
	}

	@Override
	public void atualizarCodigoEquipeTipo(EquipeTipo equipeTipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarDescricaoEquipeTipo(EquipeTipo equipeTipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarEquipeCodigo(EquipeTipo equipeTipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EquipeTipo> listarTodasEquipesTipo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
