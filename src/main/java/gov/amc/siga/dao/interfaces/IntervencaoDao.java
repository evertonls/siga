package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Intervencao;

public interface IntervencaoDao {
	
	void setDataSurce(DataSource ds);
	
	void salvarIntervencao(String intervencaoCodigo, Long projetoId, Double quantidade);
	
	void atualizarIntervencao(String intervencaoCodigo, Long projetoId, Double quantidade);
	
	void deletarIntervencao(String intervencaoCodigo, Long projetoId);
	
	List<Intervencao> listarTodasIntervencoes();
	
	Intervencao listarTodasIntervencoesPorProjetoId(Long projetoId);

}
