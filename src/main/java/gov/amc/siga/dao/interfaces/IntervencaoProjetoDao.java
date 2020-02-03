package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.IntervencaoProjeto;

public interface IntervencaoProjetoDao {
	
	void setDataSurce(DataSource ds);
	
	void salvarIntervencaoProjeto(IntervencaoProjeto intervencoes);
	
	void atualizarIntervencaoProjeto(IntervencaoProjeto intervencoes);
	
	void deletarIntervencaoProjeto(IntervencaoProjeto intervencoes);
	
	List<IntervencaoProjeto> listarTodasIntervencoes();

}
