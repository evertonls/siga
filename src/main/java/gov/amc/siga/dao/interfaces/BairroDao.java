package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Bairro;

public interface BairroDao {
	
	void setDataSource(DataSource ds);
	
	void salvarBairro(String bairro);
	
	void atualizarBairro(Long bairroId, String bairro);

	void deletarBairro(Long bairroId);
	
	List<Bairro> listarTodosBairros();
	
}
