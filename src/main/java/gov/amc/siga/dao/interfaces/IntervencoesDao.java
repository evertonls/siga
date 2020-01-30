package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Intervencoes;

public interface IntervencoesDao {
	
	void setDataSurce(DataSource ds);
	
	void salvarIntervencao(String intervencaoCodigo, Long projetoId, Double quantidade);
	
	void atualizarIntervencao(String intervencaoCodigo, Long projetoId, Double quantidade);
	
	void deletarIntervencao(String intervencaoCodigo, Long projetoId);
	
	List<Intervencoes> listarTodasIntervencoes();
	
	Intervencoes listarTodasIntervencoesPorProjetoId(Long projetoId);

}
