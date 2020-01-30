package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Descricoes;

public interface DescricoesDao {

	void setDataSource(DataSource ds);
	
	void salvarDescricao(String descricaoCodigo, Long projetoId);
	
	void atualizarDescricao(String descricaoCodigo, Long projetoId);
	
	void deletarDescricao(String descricaoCodigo, Long projetoId);
	
	List<Descricoes> listarTodasDescricoes();
	
	Descricoes listarTodasDescricoesProProjetoId(Long projetoId);
}
