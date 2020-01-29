package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

public interface MotivoTipoDao {

	void setDataSource(DataSource ds);
	
	void salvarMotivoTipo(String motivoCodigo, String motivoDescricao);
	
	void atualizarMotivoTipo(String motivoCodigo, String motivoDescricao);
	
	void deletarMotivoTipo(String motivoCodigo);
	
	List<MotivoTipoDao> listarTodosMotivosTipos();
	
}
