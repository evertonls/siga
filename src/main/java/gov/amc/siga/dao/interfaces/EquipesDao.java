package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Equipes;

public interface EquipesDao {
	
	void setDataSurce(DataSource ds);
	
	void salvarEquipe(String equipeCodigo, Long projetoId);
	
	void atualizarEquipe(String equipeCodigo, Long projetoId);
	
	void deletarEquipe(String equipeCodig, Long projetoId);
	
	List<EquipesDao> listarTodasEquipes();
	
	Equipes listarTodasEquipesPorProjetoId(Long projetoId);

}
