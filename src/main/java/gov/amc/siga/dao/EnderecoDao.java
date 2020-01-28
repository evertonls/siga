package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Endereco;

public interface EnderecoDao {

	void setDataSurce(DataSource ds);
	
	void salvarEndereco(Long bairroId, String divisao, Long longradouroId, Long projetoId, String regional);
	
	void atualizarEndereco(Long longradouroId, Long projetoId);
	
	void deletarEndereco(Long longradouroId, Long projetoId);
	
	List<EnderecoDao> listarTodosEnderecos();
	
	Endereco listarTodosEnderecosPorProjetoId(Long projetoId);
}
