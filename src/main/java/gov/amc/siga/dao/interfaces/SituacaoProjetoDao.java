package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.SituacaoProjeto;

public interface SituacaoProjetoDao {

	void setDataSource(DataSource ds);
	
	void salvarSituacaoProjeto(SituacaoProjeto situacoes);
	
	void atualizadSituacaoProjeto(SituacaoProjeto situacoes);
	
	void deletarSituacaoProjeto(SituacaoProjeto situacoes);
	
	List<SituacaoProjeto> listarTodasSituacoes();
}
