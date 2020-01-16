package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Aparelho;

public interface AparelhoDAO {

	public void setDataSource(DataSource ds);

	public void create(String aparelho_cod, String aparelho_desc);

	public List<Aparelho> listAparelhos();
	
	public void select(String aparelho_cod);

	public void delete(String aparelho_cod);
	
	public void update(String aparelho_code, String aparelho_desc);

}
