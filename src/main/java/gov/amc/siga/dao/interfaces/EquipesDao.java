package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Equipes;

public interface EquipesDao {
	
	void setDataSurce(DataSource ds);
	
	void salvarEquipe(Equipes equipes);
	
	void atualizarEquipe(Equipes equipes);
	
	void deletarEquipe(Equipes equipes);
	
	List<EquipesDao> listarTodasEquipes();

}
