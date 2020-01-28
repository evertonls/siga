package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.DescricaoTipo;

public interface DescricaoTipoDao {

	void setDataSource(DataSource ds);
	
	void salvarDescricaoTipo(String descricaoCodigo, String descricaoDescricao);
	
	void atualizarDescricaoTipo(String descricaoCodigo, String descricaoDescricao);
	
	void deletarDescricaoTipo(String descricaoCodigo, String descricaoDescricao);
	
	List<DescricaoTipo> listarTodasDescricoestipos();
}
