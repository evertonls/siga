package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Aparelho;

public interface AparelhamentoDao {
	
	//void setDataSource(DataSource dataSource);

	void salvar(String aparelhoCodigo, Long projetoId, Double quantidade);

	void deletar(Long projetoId);

	void atualizar(String aparelhoCodigo, Double quantidade);
			
	List<Aparelho> listarTodos();
}
