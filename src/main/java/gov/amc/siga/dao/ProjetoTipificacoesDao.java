package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.ProjetoTipificacoes;

public interface ProjetoTipificacoesDao {
	
	void setDataSource(DataSource ds);
	
	void salvatProjetoTipificacao(String projetoTipoCodigo, Long projetoId);
	
	void atualziarProjetoTipificacao(String projetoTipoCodigo, Long projetoId);
	
	void deletarProjetoTipificacao(String projetoTipoCodigo, Long projetoId);
	
	List<ProjetoTipificacoes> listarTodosProjetosTipificacoes();
	
	List<ProjetoTipificacoes> listarTodosProjetosTipificacoesPorProjetoId();

}
