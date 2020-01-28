package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Aparelho;

public interface AparelhoDao {
	
	void setDataSource(DataSource ds);

	void salvarAparelho(String aparelhoCodigo, Long projetoId, Double quantidade);

	void atualizarAparelho(String aparelhoCodigo, Double quantidade);

	void deletarAparelho(Long projetoId, String aparelhoCodigo);
			
	List<Aparelho> listarTodosAparelhos();
	
	List<Aparelho> listarTodosAparelhosPorProjetoId(Long projetoId);
	
}
