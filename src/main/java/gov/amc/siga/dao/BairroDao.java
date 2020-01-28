package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Bairro;

public interface BairroDao {
	
	void setDataSource(DataSource ds);
	
	void salvarBairro(String bairro, long bairroId);
	
	void atualizarBairro(long bairroId, String bairro);

	void deletarBairro(long bairroId);
	
	List<Bairro> listarTodosBairros();
}
