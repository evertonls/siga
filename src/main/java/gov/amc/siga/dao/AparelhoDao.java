package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Aparelho;

public interface AparelhoDao {
	
	void setDataSource(DataSource ds);

	void salvarAparelho(String aparelhoCodigo, long projetoId, double quantidade);

	void atualizarAparelho(String aparelhoCodigo, double quantidade);

	void deletarAparelho(long projetoId, String aparelhoCodigo);
			
	List<Aparelho> listarTodosAparelhos();
	
	List<Aparelho> listarTodosAparelhosPorProjetoId();
}
