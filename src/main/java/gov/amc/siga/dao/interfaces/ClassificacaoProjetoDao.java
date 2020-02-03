package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.ClassificacaoProjeto;

public interface ClassificacaoProjetoDao {

	void setDataSource(DataSource ds);

	void salvarClassificacaoProjeto(ClassificacaoProjeto classificacoes);

	void atualizarClassificacaoProjeto(ClassificacaoProjeto classificacoes);

	void deletarClassificacaoProjeto(ClassificacaoProjeto classificacoes);
	
	List<ClassificacaoProjeto> listarTodasClassificacoes();
}
