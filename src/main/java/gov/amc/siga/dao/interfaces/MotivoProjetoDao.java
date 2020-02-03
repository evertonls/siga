package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.MotivoProjeto;

public interface MotivoProjetoDao {

	void setDataSource(DataSource ds);
	
	void salvarMotivoProjeto(MotivoProjeto motivos);
	
	void atualizarMotivoProjeto(MotivoProjeto motivos);
	
	void deletarMotivoProjeto(MotivoProjeto motivos);
	
	List<MotivoProjeto> listarTodosMotivos();
}
