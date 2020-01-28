package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Descricao;

public interface DescricaoDao {

	void setDataSource(DataSource ds);
	
	void salvarDescricao(String descricaoCodigo, long projetoId);
	
	void atualizarDescricao(String descricaoCodigo, long projetoId);
	
	void deletarDescricao(String descricaoCodigo, long projetoId);
	
	List<Descricao> listarTodasDescricoes();
}
