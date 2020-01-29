package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Aparelho;

public interface AparelhoDao {
	
	void setDataSource(DataSource ds);

	void salvarAparelhamento(String aparelhoCodigo, Long projetoId, Double quantidade);

	void atualizarAparelhamento(String aparelhoCodigo, Double quantidade);

	void deletarAparelhamento(Long projetoId, String aparelhoCodigo);
	
	void deletarAparelhamentoEspecifico(String aparelhoCodigo, Long projetoId, Double quantidade );
			
	List<Aparelho> listarTodosAparelhos();
	
	List<Aparelho> listarTodosAparelhosPorProjetoId(Long projetoId);
	
}
