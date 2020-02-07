package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.IntervencaoTipo;

public interface IntervencaoTipoDao {

	void salvarIntervencaoTipo(IntervencaoTipo intervencaoTipo);

	void atualizarCodigoIntervencaoTipo(IntervencaoTipo intervencaoTipo);

	void atualizarDescricaoIntervencaoTipo(IntervencaoTipo intervencaoTipo);

	void deletarIntervencaoTipo(IntervencaoTipo intervencaoTipo);

	List<IntervencaoTipo> listarTodasIntervencoes();

}
