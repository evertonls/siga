package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.DescricaoTipo;

public interface DescricaoTipoDao {

	void salvarDescricaoTipo(DescricaoTipo descricaoTipo);
	
	void atualizarDescricaoTipo(DescricaoTipo decricaoTipo);
	
	void deletarDescricaoTipo(DescricaoTipo descricaoTipo);
	
	List<DescricaoTipo> listarTodasDescricoesTipos();
	
}
