package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.AparelhoTipo;

public interface AparelhoTipoDao {
	
	void setDataSource(DataSource dataSource);

	void salvarAparelhoTipo(String aparelhoCodigo, String aparelhoDescricao);

	void atualizarAparelhoTipo(String aparelhoCodigo, String aparelhoDescricao);

	void deletarAparelhoTipo(String aparlehoCodigo);
			
	List<AparelhoTipo> listarTodosAparelhosTipo();

}
