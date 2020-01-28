package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Classificacao;

public interface ClassificacaoDao {

	void setDataSource(DataSource ds);

	void salvarClassificacao(String classificacaoCodigo, long projetoId);

	void atualizarClassificacao(String classificacaoCodigo, long projetoId);

	void deletarClassificacao(String classificacaoCodigo, long projetoId);
	
	List<Classificacao> listarTodasClassificacoes();
}
