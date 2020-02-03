package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.TipoProjeto;

public interface TipoProjetoDao {

	void setDataSource(DataSource ds);

	void salvarTipoProjeto(TipoProjeto projetoTipificacoes);

	void atualizarTipoProjeto(TipoProjeto projetoTipificacoes);

	void deletarTipoProjeto(TipoProjeto projetoTipificacoes);

	List<TipoProjeto> listarTodosProjetosTipificacoes();

}
