package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Aparelhamento;

public interface AparelhamentoDao {
	
	void setDataSource(DataSource ds);

	void salvarAparelhamento(Aparelhamento aparelhamento);

	void atualizarAparelhamento(Aparelhamento aparelhamento);

	void deletarAparelhamento(Aparelhamento aparelhamento);
	
	void deletarAparelhamentoEspecifico(Aparelhamento aparelhamento);
			
	List<Aparelhamento> listarTodosAparelhos();
	
}
