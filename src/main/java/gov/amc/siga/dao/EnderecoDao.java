package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

public interface EnderecoDao {

	void setDataSurce(DataSource ds);
	
	void salvarEndereco(long bairroId, String divisao, long longradouroId, long projetoId, String regional);
	
	void atualizarEndereco(long longradouroId, long projetoId);
	
	void deletarEndereco(long longradouroId, long projetoId);
	
	List<EnderecoDao> listarTodosEnderecos();
}
