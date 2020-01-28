package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Descricao;

public interface DescricaoDao {

	void setDataSource(DataSource ds);
	
	void salvarDescricao(String descricaoCodigo, Long projetoId);
	
	void atualizarDescricao(String descricaoCodigo, Long projetoId);
	
	void deletarDescricao(String descricaoCodigo, Long projetoId);
	
	List<Descricao> listarTodasDescricoes();
	
	Descricao listarTodasDescricoesProProjetoId(Long projetoId);
}
