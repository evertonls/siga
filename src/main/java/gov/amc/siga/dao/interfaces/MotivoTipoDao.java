package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.MotivoTipo;

public interface MotivoTipoDao {

	void setDataSource(DataSource ds);
	
	void salvarMotivoTipo(MotivoTipo motivoTipo);
	
	void atualizarMotivoTipo(MotivoTipo motivoTipo);
	
	void deletarMotivoTipo(MotivoTipo motivoTipo);
	
	List<MotivoTipoDao> listarTodosMotivosTipos();
	
}
