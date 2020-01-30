package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.ClassificacoesDao;
import gov.amc.siga.dao.mapper.ClassificacaoMapper;
import gov.amc.siga.model.Classificacoes;

@Repository
public class ClassificacoesDaoImplementacao implements ClassificacoesDao, Serializable {

	private static final long serialVersionUID = 1L;
	private final String sqlSalvarClassificacoes = "INSERT INTO siga.classificacoes (classificacao_cod, projeto_id) VALUES( ?,  ?)";
	private final String sqlAtualizarClassificacoes = "UPDATE siga.classificacoes SET classificacao_cod=? WHERE projeto_id=?";
	private final String sqlDeletarClassificacoes = "DELETE FROM siga.classificacoes WHERE classificacao_cod=? AND projeto_id=?";
	private final String sqlListarTodasClassificacoes = "SELECT classificacao_cod, projeto_id FROM siga.classificacoes";
	private final String sqlListarClassificacaoPorProjetoId = "SELECT classificacao_cod, projeto_id FROM siga.classificacoes WHERE projeto_id = ?";
	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public void salvarClassificacao(String classificacaoCodigo, Long projetoId) {
		JdbcTemplate salvar = new JdbcTemplate(dataSource);
		salvar.update(sqlSalvarClassificacoes, new Object[] { classificacaoCodigo, projetoId });
	}

	@Override
	public void atualizarClassificacao(String classificacaoCodigo, Long projetoId) {
		JdbcTemplate atualizar = new JdbcTemplate(dataSource);
		atualizar.update(sqlAtualizarClassificacoes, new Object[] { classificacaoCodigo, projetoId });
	}

	@Override
	public void deletarClassificacao(String classificacaoCodigo, Long projetoId) {
		JdbcTemplate deletar = new JdbcTemplate(dataSource);
		deletar.update(sqlDeletarClassificacoes, new Object[] { classificacaoCodigo, projetoId });
	}

	@Override
	public List<Classificacoes> listarTodasClassificacoes() {
		JdbcTemplate listar = new JdbcTemplate(dataSource);
		return listar.query(sqlListarTodasClassificacoes, new ClassificacaoMapper());
	}

	@Override
	public int listarTodasClassificacoesPorProjetoId(Long projetoId) {
		JdbcTemplate listar = new JdbcTemplate(dataSource);
		return listar.update(sqlListarClassificacaoPorProjetoId, new Object[] { projetoId });
	}

}
