package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Descricoes;

public interface DescricoesDao {

	void setDataSource(DataSource ds);
	
	void salvarDescricao(Descricoes descricoes);
	
	void atualizarDescricao(Descricoes descricoes);
	
	void deletarDescricao(Descricoes descricoes);
	
	List<Descricoes> listarTodasDescricoes();
}
