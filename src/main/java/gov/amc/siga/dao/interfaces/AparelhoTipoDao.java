package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.AparelhoTipo;

public interface AparelhoTipoDao {

	void salvarAparelhoTipo(AparelhoTipo aparelhoTipo);

	void atualizarCodigoAparelhoTipo(AparelhoTipo aparelhoTipo);

	void atualizarDescricaoAparelhoTipo(AparelhoTipo aparelhoTipo);

	void deletarAparelhoTipo(AparelhoTipo aparelhoTipo);

	List<AparelhoTipo> listarTodosAparelhosTipo();

}
