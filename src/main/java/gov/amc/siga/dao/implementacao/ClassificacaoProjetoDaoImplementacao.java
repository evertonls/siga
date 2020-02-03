package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.ClassificacaoProjetoDao;
import gov.amc.siga.dao.mapper.ClassificacaoProjetoMapper;
import gov.amc.siga.model.ClassificacaoProjeto;

@Repository
public class ClassificacaoProjetoDaoImplementacao implements ClassificacaoProjetoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void setDataSource(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarClassificacaoProjeto(ClassificacaoProjeto classificacoes) {
		final String query = "INSERT INTO siga.classificacao_projeto (classificacao_cod, projeto_id) VALUES( ?,  ?)";
		Object[] args = new Object[] { classificacoes.getClassificacaoCodigo(),
				classificacoes.getProjetoId() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Classificacao salva!");
		} else {
			log.info("Falha ao salvar a classificacao!");
		}
	}

	@Override
	public void atualizarClassificacaoProjeto(ClassificacaoProjeto classificacoes) {
		final String query = "UPDATE siga.classificacao_projeto SET classificacao_cod= ?, projeto_id= ? WHERE classificacao_id= ?;";
		Object[] args = new Object[] { classificacoes.getClassificacaoCodigo(),
				classificacoes.getProjetoId(), classificacoes.getClassificacaoId() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Classificacao salva!");
		} else {
			log.info("Falha ao salvar a classificacao!");
		}
	}

	@Override
	public void deletarClassificacaoProjeto(ClassificacaoProjeto classificacoes) {
		final String query = "DELETE FROM siga.classificacao_projeto WHERE classificacao_id= ?";
		Object[] args = new Object[] { classificacoes.getClassificacaoId() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Classificacao salva!");
		} else {
			log.info("Falha ao salvar a classificacao!");
		}
	}

	@Override
	public List<ClassificacaoProjeto> listarTodasClassificacoes() {
		final String query = "SELECT classificacao_id, classificacao_cod, projeto_id FROM siga.classificacao_projeto";
		return template.query(query, new ClassificacaoProjetoMapper());
	}

}
