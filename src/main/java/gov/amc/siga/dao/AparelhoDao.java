package gov.amc.siga.dao;

import java.util.List;

import gov.amc.siga.model.Aparelho;

public interface AparelhoDao {

	public int count();
	
	public int save(Aparelho aparelho);
	
	public int update(Aparelho aparelho);
	
	public int deleteByCode(String code);
	
	public List<Aparelho> findAll();
	
	public String getNameByCode(String code);

}
