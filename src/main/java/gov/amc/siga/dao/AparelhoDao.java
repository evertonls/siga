package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Aparelho;

public interface AparelhoDao {

	public void setDataSource( DataSource ds );
	
	public void create( String aparelho_cod, String aparelho_desc );
	
	public Aparelho getAparelho( String aparelho_cod);
	
	public List<Aparelho> listarAparelhos();
	
	public void delete( String aparelho_cod );
	
	public void update( String aparelho_cod, String aparelho_desc );
	
}
