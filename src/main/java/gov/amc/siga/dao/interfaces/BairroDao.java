package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.Bairro;

public interface BairroDao {
	
	void salvarBairro(Bairro bairro);
	
	void atualizarBairro(Bairro bairro);

	void deletarBairro(Bairro bairro);
	
	List<Bairro> listarTodosBairros();
	
}
