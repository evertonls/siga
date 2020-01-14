package gov.amc.siga.dao;

import java.util.List;

import gov.amc.siga.model.Aparelho;

public interface AparelhoDao {

	public int contadorAparelho();
	
	public int salvarAparelho(Aparelho aparelho);
	
	public int atualizarAparelho(Aparelho aparelho);
	
	public int deletarAparelho(Aparelho aparelho);
	
	public List<Aparelho> procurarTodosAparelhos();
	
	public List<Aparelho> procurarPeloCodigo(String aparelho_cod);
	


}
