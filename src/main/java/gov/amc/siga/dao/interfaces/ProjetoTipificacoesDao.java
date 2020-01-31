package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.ProjetoTipificacoes;

public interface ProjetoTipificacoesDao {

	void setDataSource(DataSource ds);

	void salvatProjetoTipificacao(ProjetoTipificacoes projetoTipificacoes);

	void atualziarProjetoTipificacao(ProjetoTipificacoes projetoTipificacoes);

	void deletarProjetoTipificacao(ProjetoTipificacoes projetoTipificacoes);

	List<ProjetoTipificacoes> listarTodosProjetosTipificacoes();

}
