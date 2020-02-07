package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.ProjetoTipo;

public interface ProjetoTipoDao {

	void salvarProjetoTipo(ProjetoTipo projetoTipo);
	
	void atualizarCodigoProjetoTipo(ProjetoTipo projetoTipo);
	
	void atualizarDescricaoProjetoTipo(ProjetoTipo projetoTipo);
	
	void deletarProjetoTipo(ProjetoTipo projetoTipo);
	
	List<ProjetoTipo> listarTodosProjetosTipos();
}
