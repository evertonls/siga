package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.EquipeTipo;

public interface EquipeTipoDao {

	void setDataSurce(DataSource ds);
	
	void salvarEquipeTipo(String equipeCodigo, String equipeDescricao);
	
	void atualizarEquipeTipo(String equipeCodigo, String equipeDescricao);
	
	void deletarEquipeCodigo(String equipeCodigo, String equipeDescricao);
	
	List<EquipeTipo> listarTodasEquipes();
	
	List<EquipeTipo> listarEquipePorProjetoId();
}
