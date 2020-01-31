package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Endereco;

public interface EnderecoDao {

	void setDataSurce(DataSource ds);
	
	void salvarEndereco(Endereco endereco);
	
	void atualizarEndereco(Endereco endereco);
	
	void deletarEndereco(Endereco endereco);
	
	List<EnderecoDao> listarTodosEnderecos();
}
