package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.ClassificacaoTipo;

public interface ClassificacaoTipoDao {

	void setDataSource(DataSource ds);
	
	void salvarClassificacaoTipo(ClassificacaoTipo classificacaoTipo);
	
	void atualizarClassificacaoTipo(ClassificacaoTipo classificacaoTipo);
	
	void deletarClassificacaoTipo(ClassificacaoTipo classificacaoTipo);
	
	List<ClassificacaoTipo> listarTodasClassificacaoTipo();
	
}
