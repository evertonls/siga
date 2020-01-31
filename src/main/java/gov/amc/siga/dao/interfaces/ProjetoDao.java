package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Projeto;

public interface ProjetoDao {

	void setDataSource(DataSource ds);

	void salvarProjeto(Projeto projeto);

	void atualizarProjeto(Projeto projeto);
	
	void deletarProejto(Projeto projeto);
	
	List<Projeto> listarTodosProjetos();
	
}
