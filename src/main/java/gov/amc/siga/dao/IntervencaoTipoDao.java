package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.IntervencaoTipo;

public interface IntervencaoTipoDao {

	void setDataSurce(DataSource ds);
	
	void salvarIntervencaoTipo(String intervencaoCodigo, String intervencaoDescricao);
	
	void atualizarIntervencaoTipo(String intervencaoCodigo, String intervencaoDescricao);
	
	void deletarIntervencaoTipo(String intervencaoCodigo);
	
	List<IntervencaoTipo> listarTodasIntervencoes();
	
}
