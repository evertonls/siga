package gov.amc.siga.dao;

import java.util.List;

import gov.amc.siga.model.Bairro;

public interface BairroDao {
	
	void salvarBairro(String bairro);
	
	void atualizarBairro(Long id, String bairro);
	
	void deletarBairro(Long id);
	
	List<Bairro> listarTodos();

}
