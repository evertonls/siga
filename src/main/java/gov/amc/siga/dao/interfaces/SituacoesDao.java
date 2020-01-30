package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Situacoes;

public interface SituacoesDao {

	void setDataSource(DataSource ds);
	
	void salvarSituacao(String situacaoCodigo, Long projetoId);
	
	void atualizadSituacao(String situacaoCodigo, Long projetoId);
	
	void deletarSituacao(String situacaoCodigo);
	
	List<Situacoes> listarTodasSituacoes();
	
	Situacoes listarTodasSituacoesPorProjetoId();
}
