package gov.amc.siga.dao;

import java.util.List;

import gov.amc.siga.model.AparelhoTipo;

public interface AparelhoTipoDao {
	
	AparelhoTipo buscarPeloCodigo(String aparelhoCodigo);
	
	List<AparelhoTipo> listarTodos();
	
	boolean deletarAparelho(AparelhoTipo aparelhoTipo);
	
	boolean atualizarAparelho(AparelhoTipo aparelhoTipo);
	
	boolean salvarAparelho(AparelhoTipo aparelhoTipo);
}
