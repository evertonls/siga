package gov.amc.siga.daos.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.models.AparelhoTipo;

public interface AparelhoDAO {

	void setDataSource(DataSource ds);

	void salvar(String aparelhoCodigo, String aparelhoDescricao);
	
	void deletar(String aparelhoCodigo);
	
	void atualizar(String aparelhoCodigo, String aparelhoDescricao);

	List<AparelhoTipo> listarAparelhos();
}
