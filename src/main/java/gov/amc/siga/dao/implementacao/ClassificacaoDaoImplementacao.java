package gov.amc.siga.dao.implementacao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.ClassificacaoDao;
import gov.amc.siga.model.Classificacao;

@Repository
public class ClassificacaoDaoImplementacao implements ClassificacaoDao {

	private final String sqlSalvarClassificao = "INSERT INTO siga.classificacoes (classificacao_cod, projeto_id) VALUES( ?,  ?)";
	private final String sqlAtualizarClassificacao = "UPDATE siga.classificacoes SET classificacao_cod=?, projeto_id=?";
	private final String sqlDeletarClassificacao = "DELETE FROM siga.classificacoes WHERE classificacao_cod=? AND projeto_id=?";
	private final String sqlListarTodasClassificacoes = "SELECT classificacao_cod, projeto_id FROM siga.classificacoes";

	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public void salvarClassificacao(String classificacaoCodigo, Long projetoId) {
		JdbcTemplate salvar = new JdbcTemplate(dataSource);
		salvar.update(sqlSalvarClassificao, new Object[] { classificacaoCodigo, projetoId });
	}

	@Override
	public void atualizarClassificacao(String classificacaoCodigo, Long projetoId) {
		JdbcTemplate atualizar = new JdbcTemplate(dataSource);
		atualizar.update(sqlAtualizarClassificacao, new Object[] { classificacaoCodigo, projetoId });
	}

	@Override
	public void deletarClassificacao(String classificacaoCodigo, Long projetoId) {
		JdbcTemplate deletar = new JdbcTemplate(dataSource);
		deletar.update(sqlDeletarClassificacao, new Object[] {classificacaoCodigo, projetoId});
	}

	@Override
	public List<Classificacao> listarTodasClassificacoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classificacao listarTodasClassificacoesPorProjetoId(Long projetoId) {
		// TODO Auto-generated method stub
		return null;
	}

}
