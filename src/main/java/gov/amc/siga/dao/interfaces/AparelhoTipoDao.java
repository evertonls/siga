package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.AparelhoTipo;

public interface AparelhoTipoDao {
	
	void setDataSource(DataSource ds);

	void salvarAparelhoTipo(AparelhoTipo aparelhoTipo);
	
	void atualizarCodigoAparelhoTipo(AparelhoTipo aparelhoTipo);
	
	void atualizarDescricaoAparelhoTipo(AparelhoTipo aparelhoTipo);

	void deletarAparelhoTipo(AparelhoTipo aparelhoTipo);
			
	List<AparelhoTipo> listarTodosAparelhosTipo();
	
}
