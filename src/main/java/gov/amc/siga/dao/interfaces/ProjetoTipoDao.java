package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.ProjetoTipo;

public interface ProjetoTipoDao {

	void setDataSource(DataSource ds);
	
	void salvarProjetoTipo(String projetoTipoCodigo, String projetoTipoDescricao);
	
	void atualizarProjetoTipo(String projetoTipoCodigo, String projetoTipoDescricao);
	
	void deletarProjetoTipo(String projetoTipoCodigo);
	
	List<ProjetoTipo> listarTodosProjetosTipos();
}
