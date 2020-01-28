package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Intervencao;

public interface IntervencaoDao {
	
	void setDataSurce(DataSource ds);
	
	void salvarIntervencao(String intervencaoCodigo, long projetoId, double quantidade);
	
	void atualizarIntervencao(String intervencaoCodigo, long projetoId, double quantidade);
	
	void deletarIntervencao(String intervencaoCodigo, long projetoId, double quantidade);
	
	List<Intervencao> listarTodasIntervencoes();
	
	List<Intervencao> listarTodasIntervencoesPorProjetoId();

}
