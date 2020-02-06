package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.TipoProjeto;

public interface TipoProjetoDao {

	void setDataSource(DataSource ds);

	void salvarTipoProjeto(TipoProjeto tipoProjeto);

	void atualizarTipoProjetoCodigo(TipoProjeto tipoProjeto);
	
	void atualizarTipoProjetoDescricao(TipoProjeto tipoProjeto);

	void deletarTipoProjeto(TipoProjeto tipoProjeto);

	List<TipoProjeto> listarTodosProjetosTiposs();

}
