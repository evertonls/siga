package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.AparelhoProjeto;

public interface AparelhoProjetoDao {
	
	void setDataSource(DataSource ds);

	void salvarAparelhoProjeto(AparelhoProjeto aparelhamento);

	void atualizarAparelhoProjeto(AparelhoProjeto aparelhamento);

	void deletarAparelhoProjeto(AparelhoProjeto aparelhamento);
	
	List<AparelhoProjeto> listarTodosAparelhos();
	
}
