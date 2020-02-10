package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.ClassificacaoTipoDao;
import gov.amc.siga.model.ClassificacaoTipo;

@Repository
public class ClassificacaoTipoDaoImplemetacao implements ClassificacaoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	private static final String listar = "SELECT  classificacao_cod, classificacao_desc FROM siga.classificacao_tipo";

	public ClassificacaoTipoDaoImplemetacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		log.info("Salvando tipo de classificação..." + classificacaoTipo.getClassificacaoCodigo());
		final String sql = "INSERT INTO siga.classificacao_tipo (classificacao_cod, classificacao_desc) VALUES( ?, ?)";
		template.update(sql, classificacaoTipo.getClassificacaoCodigo(), classificacaoTipo.getClassificacaoDescricao());
	}

	@Override
	public void atualizarCodigoClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		log.info("Atualizando código do tipo de classificação.." + classificacaoTipo.getClassificacaoCodigo());
		final String sql = "UPDATE siga.classificacao_tipo SET classificacao_cod= ? WHERE classificacao_cod= ?";
		template.update(sql, classificacaoTipo.getClassificacaoDescricao(), classificacaoTipo.getClassificacaoCodigo());
	}
	
	@Override
	public void atualizarDescricaoClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		log.info("Atualizando descricao do tipo de classificacao..." + classificacaoTipo.getClassificacaoDescricao());
		final String sql = "UPDATE siga.classificacao_tipo SET classificacao_desc= ? WHERE classificacao_cod= ?";
		template.update(sql, classificacaoTipo.getClassificacaoDescricao(), classificacaoTipo.getClassificacaoCodigo());
	}

	@Override
	public void deletarClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		log.info("Deletando tipo de classificação.." + classificacaoTipo.getClassificacaoCodigo());
		final String sql = "DELETE FROM siga.classificacao_tipo WHERE classificacao_cod= ?";
		template.update(sql, classificacaoTipo.getClassificacaoCodigo());
	}

	@Override
	public List<ClassificacaoTipo> listarTodasClassificacaoTipo() {
		return template.query(listar, this::classificacaoTipoMapRow);
	}
	
	private ClassificacaoTipo classificacaoTipoMapRow(ResultSet rs, int numRow) throws SQLException {
		return new ClassificacaoTipo(rs.getString("classificacao_cod"), rs.getString("classificacao_desc"));
	}

}
