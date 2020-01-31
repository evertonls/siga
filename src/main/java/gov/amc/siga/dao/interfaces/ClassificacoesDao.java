package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Classificacoes;

public interface ClassificacoesDao {

	void setDataSource(DataSource ds);

	void salvarClassificacao(Classificacoes classificacoes);

	void atualizarClassificacao(Classificacoes classificacoes);

	void deletarClassificacao(Classificacoes classificacoes);
	
	List<Classificacoes> listarTodasClassificacoes();
}
