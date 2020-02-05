package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.EquipeTipo;

public interface EquipeTipoDao {

	void setDataSurce(DataSource ds);
	
	void salvarEquipeTipo(EquipeTipo equipeTipo);
	
	void atualizarCodigoEquipeTipo(EquipeTipo equipeTipo);
	
	void atualizarDescricaoEquipeTipo(EquipeTipo equipeTipo);
	
	void deletarEquipeCodigo(EquipeTipo equipeTipo);
	
	List<EquipeTipo> listarTodasEquipesTipo();
	
}
