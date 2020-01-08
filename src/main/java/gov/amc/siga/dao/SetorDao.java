package gov.amc.siga.dao;

import gov.amc.siga.model.Setor;

public interface SetorDao {

	public Setor getByID(long id);
	public Setor getByCode(String code);
	public Iterable<Setor> getAll();
}
