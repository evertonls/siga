package gov.amc.siga.dao;

import java.util.List;

import gov.amc.siga.model.Bairro;

public interface BairroDao {

	public Bairro getById(Long id);
	public Bairro getByBairro(String bairro);
	public List<Bairro> getAll();
	
}
