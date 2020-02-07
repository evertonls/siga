package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.SituacaoTipo;

public interface SituacaoTipoDao {
	
	void salvarSituacaoTipo(SituacaoTipo situacaoTipo);
	
	void atualizarCodigoSituacaoTipo(SituacaoTipo situacaoTipo);

	void atualizarDescricaoSituacaoTipo(SituacaoTipo situacaoTipo);
	
	void deletarSituacaoTipo(SituacaoTipo situacaoTipo);
	
	List<SituacaoTipo> listarTodasSituacoesTipos();

}
