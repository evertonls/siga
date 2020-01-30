package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Classificacoes;

public interface ClassificacoesDao {

	void setDataSource(DataSource ds);

	void salvarClassificacao(String classificacaoCodigo, Long projetoId);

	void atualizarClassificacao(String classificacaoCodigo, Long projetoId);

	void deletarClassificacao(String classificacaoCodigo, Long projetoId);
	
	List<Classificacoes> listarTodasClassificacoes();
	
	int listarTodasClassificacoesPorProjetoId(Long projetoId);
}
