package gov.amc.siga.daos.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.models.AparelhoTipo;

public interface AparelhoDAO {

	public void setDataSource(DataSource ds);

	public void salvar(String aparelhoCodigo, String aparelhoDescricao);
	
	public void deletar(String aparelhoCodigo);
	
	public void atualizar(String aparelhoCodigo, String aparelhoDescricao);

	public List<AparelhoTipo> listarAparelhos();
}
