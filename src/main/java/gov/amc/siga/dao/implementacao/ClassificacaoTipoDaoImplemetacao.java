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

	private final String salvar = "INSERT INTO siga.classificacao_tipo (classificacao_cod, classificacao_desc) VALUES( ?, ?)";
	private final String atualizar = "UPDATE siga.classificacao_tipo SET classificacao_cod= ?, classificacao_desc= ? WHERE classificacao_cod= ?";
	private final String deletar = "DELETE FROM siga.classificacao_tipo WHERE classificacao_cod= ?";
	private final String listar = "SELECT  classificacao_cod, classificacao_desc FROM siga.classificacao_tipo";

	@Override
	public void setDataSource(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		Object[] args = new Object[] { classificacaoTipo.getClassificacaoCodigo().toUpperCase(),
				classificacaoTipo.getClassificacaoDescricao().toUpperCase() };
		int out = template.update(salvar, args);
		if (out != 0) {
			log.info("Tipo de classificação salva!");
		} else {
			log.info("Falha ao salvar o tipo de classificação");
		}
	}

	@Override
	public void atualizarClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		Object[] args = new Object[] { classificacaoTipo.getClassificacaoCodigo().toUpperCase(),
				classificacaoTipo.getClassificacaoDescricao().toUpperCase() };
		int out = template.update(atualizar, args);
		if(out != 0) {
			log.info("Tipo de classificacao atualizada!");
		}else {
			log.info("Falha ao atualizar tipo de classificacão");
		}
	}

	@Override
	public void deletarClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		Object[] args = new Object[] { classificacaoTipo.getClassificacaoCodigo().toUpperCase() };
		int out = template.update(deletar, args);
		if (out != 0) {
			log.info("Tipo de classificação deletada!");
		} else {
			log.info("Falha ao deletar o tipo de classificação");
		}
	}

	@Override
	public List<ClassificacaoTipo> listarTodasClassificacaoTipo() {
		return template.query(listar, new ClassificacaoTipoMapper());
	}

}
