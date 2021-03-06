package gov.amc.siga.dao.interfaces;

import gov.amc.siga.model.Setor;

public interface SetorDao {

	public Setor getById(long id);

	public Setor getByCode(String code);

	public Iterable<Setor> getAll();

}
