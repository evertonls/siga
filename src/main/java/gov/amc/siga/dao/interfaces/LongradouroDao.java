package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.Longradouro;

public interface LongradouroDao {

	void salvarLongradouro(Longradouro longradouro);

	void atualizarLongradouro(Longradouro longradouro);

	void deletarLongradouro(Longradouro longradouro);

	List<Longradouro> listarTodosLongradouros();

}
