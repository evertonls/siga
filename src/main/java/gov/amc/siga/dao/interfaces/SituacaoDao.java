package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Situacao;

public interface SituacaoDao {

	void setDataSource(DataSource ds);
	
	void salvarSituacao(String situacaoCodigo, Long projetoId);
	
	void atualizadSituacao(String situacaoCodigo, Long projetoId);
	
	void deletarSituacao(String situacaoCodigo);
	
	List<Situacao> listarTodasSituacoes();
	
	Situacao listarTodasSituacoesPorProjetoId();
}
