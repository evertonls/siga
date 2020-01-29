package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.SituacaoTipo;

public interface SituacaoTipoDao {
	
	void setDataSource(DataSource ds);
	
	void salvarSituacaoTipo(String situacaoCodigo, String situacaoDescricao);
	
	void atualizarSituacaoTipo(String situacaoCodigo, String situacaoDescricao);
	
	void deletarSituacaoTipo(String situacaoCodigo);
	
	List<SituacaoTipo> listarTodasSituacoesTipos();

}
