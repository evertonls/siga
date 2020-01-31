package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Motivos;

public interface MotivosDao {

	void setDataSource(DataSource ds);
	
	void salvarMotivo(Motivos motivos);
	
	void atualizarMotivo(Motivos motivos);
	
	void deletarMotivo(Motivos motivos);
	
	List<Motivos> listarTodosMotivos();
}
