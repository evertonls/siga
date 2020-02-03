package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.ClassificacaoTipoDao;
import gov.amc.siga.dao.mapper.ClassificacaoTipoMapper;
import gov.amc.siga.model.ClassificacaoTipo;

@Repository
public class ClassificacaoTipoDaoImplemetacao implements ClassificacaoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void setDataSource(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		final String query = "INSERT INTO siga.classificacao_tipo (classificacao_cod, classificacao_desc) VALUES( ?, ?)";
		Object[] args = new Object[] { classificacaoTipo.getClassificacaoCodigo().toUpperCase(),
				classificacaoTipo.getClassificacaoDescricao().toUpperCase() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Tipo de classificação salva!");
		} else {
			log.info("Falha ao salvar o tipo de classificação");
		}
	}

	@Override
	public void atualizarClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		final String query = "UPDATE siga.classificacao_tipo SET classificacao_cod= ?, classificacao_desc= ? WHERE classificacao_id= ?";
		Object[] args = new Object[] { classificacaoTipo.getClassificacaoCodigo().toUpperCase(),
				classificacaoTipo.getClassificacaoDescricao().toUpperCase() };
		int out = template.update(query, args);
		if(out != 0) {
			log.info("Tipo de classificacao atualizada!");
		}else {
			log.info("Falha ao atualizar tipo de classificacão");
		}
	}

	@Override
	public void deletarClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		final String query = "DELETE FROM siga.classificacao_tipo WHERE classificacao_cod= ?";
		Object[] args = new Object[] { classificacaoTipo.getClassificacaoCodigo().toUpperCase() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Tipo de classificação deletada!");
		} else {
			log.info("Falha ao deletar o tipo de classificação");
		}
	}

	@Override
	public List<ClassificacaoTipo> listarTodasClassificacaoTipo() {
		final String query = "SELECT classificacao_id, classificacao_cod, classificacao_desc FROM siga.classificacao_tipo";
		return template.query(query, new ClassificacaoTipoMapper());
	}

}
