package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Longradouro;

public interface LongradouroDao {

	void setDatasource(DataSource ds);

	void salvarLongradouro(Long longradouroId, String longradouro, String tipo, String titulo, String jurisdicao);

	void atualizarLognradouro(Long longradouroId, String longradouro, String tipo, String titulo, String jurisdicao);

	void deletarLongradouro(Long LongradouroId, String longradouro);

	List<Longradouro> listarTodosLongradouros();

}
