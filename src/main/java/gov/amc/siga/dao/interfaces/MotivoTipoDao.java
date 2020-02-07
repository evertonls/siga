package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.MotivoTipo;

public interface MotivoTipoDao {
	
	void salvarMotivoTipo(MotivoTipo motivoTipo);
	
	void atualizarCodigoMotivoTipo(MotivoTipo motivoTipo);
	
	void atualizarDescricaoMotivoTipo(MotivoTipo motivoTipo);
	
	void deletarMotivoTipo(MotivoTipo motivoTipo);
	
	List<MotivoTipoDao> listarTodosMotivosTipos();
	
}
