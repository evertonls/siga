package gov.amc.siga.dao;

import gov.amc.siga.model.Setor;

public interface SetorDAO {
	
		public Setor getById(long id);
		public Setor getByCode(String code);
		public Iterable<Setor> getAll();

}
