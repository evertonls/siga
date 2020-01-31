package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.SituacaoTipo;

public interface SituacaoTipoDao {
	
	void setDataSource(DataSource ds);
	
	void salvarSituacaoTipo(SituacaoTipo situacaoTipo);
	
	void atualizarSituacaoTipo(SituacaoTipo situacaoTipo);
	
	void deletarSituacaoTipo(SituacaoTipo situacaoTipo);
	
	List<SituacaoTipo> listarTodasSituacoesTipos();

}
