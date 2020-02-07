package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.Projeto;

public interface ProjetoDao {

	void salvarProjeto(Projeto projeto);

	void atualizarProjeto(Projeto projeto);

	void deletarProejto(Projeto projeto);

	List<Projeto> listarTodosProjetos();

}
