package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.DescricaoTipo;

public interface DescricaoTipoDao {

	void setDataSource(DataSource ds);
	
	void salvarDescricaoTipo(DescricaoTipo descricaoTipo);
	
	void atualizarDescricaoTipo(DescricaoTipo descricaoTipo);
	
	void deletarDescricaoTipo(DescricaoTipo descricaoTipo);
	
	List<DescricaoTipo> listarTodasDescricoesTipos();
	
}
