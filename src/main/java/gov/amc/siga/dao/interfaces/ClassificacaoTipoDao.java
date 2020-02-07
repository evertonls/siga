package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.ClassificacaoTipo;

public interface ClassificacaoTipoDao {

	void salvarClassificacaoTipo(ClassificacaoTipo classificacaoTipo);

	void atualizarCodigoClassificacaoTipo(ClassificacaoTipo classificacaoTipo);

	void atualizarDescricaoClassificacaoTipo(ClassificacaoTipo classificacaoTipo);

	void deletarClassificacaoTipo(ClassificacaoTipo classificacaoTipo);

	List<ClassificacaoTipo> listarTodasClassificacaoTipo();

}
