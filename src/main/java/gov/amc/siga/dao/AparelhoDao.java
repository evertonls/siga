package gov.amc.siga.dao;

import java.util.List;

import gov.amc.siga.model.Aparelho;

public interface AparelhoDao {

	int salvarAparelho(Aparelho aparelho);

	int atualizarAparelho(Aparelho aparelho);

	int excluirAparelho(Aparelho aparelho);

	List<Aparelho> procurarTodos();

}
