package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Equipe;

public interface EquipeDao {
	
	void setDataSurce(DataSource ds);
	
	void salvarEquipe(String equipeCodigo, Long projetoId);
	
	void atualizarEquipe(String equipeCodigo, Long projetoId);
	
	void deletarEquipe(String equipeCodig, Long projetoId);
	
	List<EquipeDao> listarTodasEquipes();
	
	Equipe listarTodasEquipesPorProjetoId(Long projetoId);

}
