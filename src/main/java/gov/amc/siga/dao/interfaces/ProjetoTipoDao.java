package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.ProjetoTipo;

public interface ProjetoTipoDao {

	void setDataSource(DataSource ds);
	
	void salvarProjetoTipo(ProjetoTipo projetoTipo);
	
	void atualizarProjetoTipoCodigo(ProjetoTipo projetoTipo);
	
	void atualizarProjetoTipoDescricao(ProjetoTipo projetoTipo);
	
	void deletarProjetoTipo(ProjetoTipo projetoTipo);
	
	List<ProjetoTipo> listarTodosProjetosTipos();
}
