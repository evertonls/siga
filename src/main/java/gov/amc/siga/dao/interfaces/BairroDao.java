package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Bairro;

public interface BairroDao {
	
	void setDataSource(DataSource ds);
	
	void salvarBairro(Bairro bairro);
	
	void atualizarBairro(Bairro bairro);

	void deletarBairro(Bairro bairro);
	
	List<Bairro> listarTodosBairros();
	
}
