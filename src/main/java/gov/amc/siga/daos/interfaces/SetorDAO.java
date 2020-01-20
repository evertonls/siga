package gov.amc.siga.daos.interfaces;

import gov.amc.siga.models.Setor;

public interface SetorDAO {
	
		public Setor getById(long id);
		public Setor getByCode(String code);
		public Iterable<Setor> getAll();

}
