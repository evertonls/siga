package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Intervencoes;

public interface IntervencoesDao {
	
	void setDataSurce(DataSource ds);
	
	void salvarIntervencao(Intervencoes intervencoes);
	
	void atualizarIntervencao(Intervencoes intervencoes);
	
	void deletarIntervencao(Intervencoes intervencoes);
	
	List<Intervencoes> listarTodasIntervencoes();

}
