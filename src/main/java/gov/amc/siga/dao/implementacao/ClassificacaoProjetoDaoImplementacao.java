package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.ClassificacaoProjetoDao;
import gov.amc.siga.dao.mapper.ClassificacaoProjetoMapper;
import gov.amc.siga.model.ClassificacaoProjeto;

@Repository
public class ClassificacaoProjetoDaoImplementacao implements ClassificacaoProjetoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public void salvarClassificacaoProjeto(ClassificacaoProjeto classificacoes) {
		final String query = "INSERT INTO siga.classificacoes (classificacao_cod, projeto_id) VALUES( ?,  ?)";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { classificacoes.getClassificacaoCodigo().toUpperCase(), classificacoes.getProjetoId() };
		int out = template.update(query, args);
		if(out!=0){
			System.out.println("Classificacao salva!");
		}else {
			System.out.println("Falha ao salvar a classificacao!");
		}
	}

	@Override
	public void atualizarClassificacaoProjeto(ClassificacaoProjeto classificacoes) {
		final String query = "UPDATE siga.classificacoes SET classificacao_cod=? WHERE projeto_id=?";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { classificacoes.getClassificacaoCodigo().toUpperCase(), classificacoes.getProjetoId() };
		int out = template.update(query, args);
		if(out!=0){
			System.out.println("Classificacao salva!");
		}else {
			System.out.println("Falha ao salvar a classificacao!");
		}
	}

	@Override
	public void deletarClassificacaoProjeto(ClassificacaoProjeto classificacoes) {
		final String query = "DELETE FROM siga.classificacoes WHERE classificacao_cod=? AND projeto_id=?";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { classificacoes.getClassificacaoCodigo().toUpperCase(), classificacoes.getProjetoId() };
		int out = template.update(query, args);
		if(out!=0){
			System.out.println("Classificacao salva!");
		}else {
			System.out.println("Falha ao salvar a classificacao!");
		}
	}

	@Override
	public List<ClassificacaoProjeto> listarTodasClassificacoes() {
		final String query = "SELECT classificacao_cod, projeto_id FROM siga.classificacoes";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		return template.query(query, new ClassificacaoProjetoMapper());
	}

	
}
