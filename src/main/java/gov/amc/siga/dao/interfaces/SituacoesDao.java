package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Situacoes;

public interface SituacoesDao {

	void setDataSource(DataSource ds);
	
	void salvarSituacao(Situacoes situacoes);
	
	void atualizadSituacao(Situacoes situacoes);
	
	void deletarSituacao(Situacoes situacoes);
	
	List<Situacoes> listarTodasSituacoes();
}
