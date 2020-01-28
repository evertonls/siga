package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Bairro;

public interface BairroDao {
	
	void setDataSource(DataSource ds);
	
	void salvarBairro(String bairro, Long bairroId);
	
	void atualizarBairro(Long bairroId, String bairro);

	void deletarBairro(Long bairroId, String bairro);
	
	List<Bairro> listarTodosBairros();
	
}
