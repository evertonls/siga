package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.Endereco;

public interface EnderecoDao {

	void salvarEndereco(Endereco endereco);
	
	void atualizarEndereco(Endereco endereco);
	
	void deletarEndereco(Endereco endereco);
	
	List<EnderecoDao> listarTodosEnderecos();
}
