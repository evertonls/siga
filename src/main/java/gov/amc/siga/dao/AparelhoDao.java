package gov.amc.siga.dao;

import java.util.List;

import gov.amc.siga.model.Aparelho;

public interface AparelhoDao {

	public int salvarAparelho(Aparelho aparelho);

	public int atualizarAparelho(Aparelho aparelho);

	public int excluirAparelho(Aparelho aparelho);

	public List<Aparelho> procurarTodos();


}
