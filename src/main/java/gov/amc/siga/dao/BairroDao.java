package gov.amc.siga.dao;

import java.util.HashMap;

import gov.amc.siga.model.Bairro;

public interface BairroDao {

	public Bairro getById(Long id);
	public Bairro getByBairro(String bairro);
	public HashMap<String, Bairro> getAll();
	
}
