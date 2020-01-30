package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Aparelhamento;

public interface AparelhamentoDao {
	
	void setDataSource(DataSource ds);

	void salvarAparelhamento(String aparelhoCodigo, Long projetoId, Double quantidade);

	void atualizarAparelhamento(String aparelhoCodigo, Double quantidade);

	void deletarAparelhamento(Long projetoId, String aparelhoCodigo);
	
	void deletarAparelhamentoEspecifico(String aparelhoCodigo, Long projetoId, Double quantidade );
			
	List<Aparelhamento> listarTodosAparelhos();
	
	List<Aparelhamento> listarTodosAparelhosPorProjetoId(Long projetoId);
	
}
