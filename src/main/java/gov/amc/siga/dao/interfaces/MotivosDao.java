package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Motivos;

public interface MotivosDao {

	void setDataSource(DataSource ds);
	
	void salvarMotivo(String motivoCodigo, Long projetoId);
	
	void atualizarMotivo(String motivoCodigo, Long projetoId);
	
	void deletarMotivo(String motivoCodigo, Long projetoId);
	
	List<Motivos> listarTodosMotivos();
	
	Motivos listarMotivoPorProjetoId(Long projetoId);
}
