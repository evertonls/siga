package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Longradouro;

public interface LongradouroDao {

	void setDatasource(DataSource ds);

	void salvarLongradouro(Longradouro longradouro);

	void atualizarLognradouro(Longradouro longradouro);

	void deletarLongradouro(Longradouro longradouro);

	List<Longradouro> listarTodosLongradouros();

}
