package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.EquipeProjeto;

public interface EquipeProjetoDao {
	
	void setDataSurce(DataSource ds);
	
	void salvarEquipeProjeto(EquipeProjeto equipes);
	
	void atualizarEquipeProjeto(EquipeProjeto equipes);
	
	void deletarEquipeProjeto(EquipeProjeto equipes);
	
	List<EquipeProjetoDao> listarTodasEquipes();

}
