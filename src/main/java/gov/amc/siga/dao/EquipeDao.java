package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

public interface EquipeDao {
	
	void setDataSurce(DataSource ds);
	
	void salvarEquipe(String equipeCodigo, long projetoId);
	
	void atualizarEquipe(String equipeCodigo, long projetoId);
	
	void deletarEquipe(String equipeCodig, long projetoId);
	
	List<EquipeDao> listarTodasEquipes();
	
	List<EquipeDao> listarEquipePorProjetoId();

}
