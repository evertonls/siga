package gov.amc.siga.dao;

import java.util.HashMap;

import gov.amc.siga.model.Aparelho;

public interface AparelhoDao {
	
	public Aparelho getByCode(String aparelho_cod);
	public HashMap<String, Aparelho> getAll();
	
	

}
