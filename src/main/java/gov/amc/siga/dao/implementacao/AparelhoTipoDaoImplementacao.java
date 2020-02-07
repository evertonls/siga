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

import gov.amc.siga.dao.interfaces.AparelhoTipoDao;
import gov.amc.siga.model.AparelhoTipo;

@Repository
public class AparelhoTipoDaoImplementacao implements AparelhoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	private final String listar = "SELECT aparelho_cod, aparelho_desc FROM siga.aparelho_tipo";

	public AparelhoTipoDaoImplementacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarAparelhoTipo(AparelhoTipo aparelhoTipo) {
		log.info("Salvando novo tipo de aparelho. " + aparelhoTipo.getAparelhoCodigo());
		final String salvar = "INSERT INTO siga.aparelho_tipo (aparelho_cod, aparelho_desc) VALUES (?, ?)";
		template.update(salvar, aparelhoTipo.getAparelhoCodigo(),
				aparelhoTipo.getAparelhoDescricao());
		}

	@Override
	public void atualizarCodigoAparelhoTipo(AparelhoTipo aparelhoTipo) {
		log.info("Atualizando código.");
		final String atualizarCodigo = "UPDATE siga.aparelho_tipo SET aparelho_cod=? WHERE aparelho_cod=?";
		template.update(atualizarCodigo, aparelhoTipo.getAparelhoCodigo());
	}
	
	@Override
	public void atualizarDescricaoAparelhoTipo(AparelhoTipo aparelhoTipo) {
		log.info("Atualizando descrição.");
		final String atualizarDescricao = "UPDATE siga.aparelho_tipo SET aparelho_desc=? WHERE aparelho_cod=?";
		template.update(atualizarDescricao, aparelhoTipo.getAparelhoDescricao(), aparelhoTipo.getAparelhoCodigo());
	}

	@Override
	public void deletarAparelhoTipo(AparelhoTipo aparelhoTipo) {
		log.info("Deletando tipo de aparelho.");
		final String deletar = "DELETE FROM siga.aparelho_tipo WHERE aparelho_cod = ?";
		template.update(deletar, aparelhoTipo.getAparelhoCodigo());
	}

	@Override
	public List<AparelhoTipo> listarTodosAparelhosTipo() {
		return template.query(listar, this::aparelhoMapRow);
	}
	
	private AparelhoTipo aparelhoMapRow(ResultSet rs, int numRow) throws SQLException {
		return new AparelhoTipo(rs.getString("aparelho_cod"), rs.getString("aparelho_desc"));
	}

}
