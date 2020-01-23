package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Aparelhamento;

public interface AparelhamentoDao {
	
	void setDataSource(DataSource dataSource);

	void salvar(String aparelhoCodigo, Long projeto_id, Double quantidade);

	void deletar(Long projeto_id);

	void atualizar(String aparelhoCodigo, Double quantidade);
			
	List<Aparelhamento> listarTodos();
}
