package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.IntervencaoTipo;

public interface IntervencaoTipoDao {

	void setDataSurce(DataSource ds);
	
	void salvarIntervencaoTipo(IntervencaoTipo intervencaoTipo);
	
	void atualizarIntervencaoTipo(IntervencaoTipo intervencaoTipo);
	
	void deletarIntervencaoTipo(IntervencaoTipo intervencaoTipo);
	
	List<IntervencaoTipo> listarTodasIntervencoes();
	
}
