package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Aparelho;

public interface AparelhoDao {
	
	void setDataSource(DataSource dataSource);

	void salvar(String aparelhoCodigo, long projetoId, double quantidade);

	void deletar(long projetoId);

	void atualizar(String aparelhoCodigo, double quantidade);
			
	List<Aparelho> listarTodos();
}
