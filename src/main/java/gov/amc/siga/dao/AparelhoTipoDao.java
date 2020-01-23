package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.AparelhoTipo;

public interface AparelhoTipoDao {
	
	void setDataSource(DataSource dataSource);

	void salvar(String aparelhoCodigo, String aparelhoDescricao);

	void deletar(String aparlehoCodigo);

	void atualizar(String aparelhoCodigo, String aparelhoDescricao);
			
	List<AparelhoTipo> listarTodos();
}
