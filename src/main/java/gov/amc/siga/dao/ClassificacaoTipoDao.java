package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.ClassificacaoTipo;

public interface ClassificacaoTipoDao {

	void setDataSource(DataSource ds);
	
	void salvarClassificacaoTipo(String classificacaoCodigo, String classificacaoDescricao);
	
	void atualizarClassificacaoTipo(String classificacaoCodigo, String classificacaoDescricao);
	
	void deletarClassificacaoTipo(String classificacaoCodigo);
	
	List<ClassificacaoTipo> listarTodasClassificacaoTipo();
}
