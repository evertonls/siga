package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.DescricaoProjeto;

public interface DescricaoProjetoDao {

	void setDataSource(DataSource ds);
	
	void salvarDescricaoProjeto(DescricaoProjeto descricoes);
	
	void atualizarDescricaoProjeto(DescricaoProjeto descricoes);
	
	void deletarDescricaoProjeto(DescricaoProjeto descricoes);
	
	List<DescricaoProjeto> listarTodasDescricoes();
}
