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

import gov.amc.siga.dao.interfaces.AparelhoProjetoDao;
import gov.amc.siga.model.AparelhoProjeto;

@Repository
public class AparelhoProjetoDaoImplementacao implements AparelhoProjetoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	private final String salvar = "INSERT INTO siga.aparelho_projeto (aparelho_cod, projeto_id, quantidade) VALUES( ?, ?, ?)";
	private final String atualizar = "UPDATE siga.aparelho_projeto SET aparelho_cod=?, quantidade=? WHERE aparelho_cod=? AND projeto_id=?";
	private final String deletar = "DELETE FROM siga.aparelho_projeto WHERE aparelho_cod=? AND projeto_id = ?";
	private final String listar = "SELECT aparelho_cod, projeto_id, quantidade FROM siga.aparelho_projeto";

	@Override
	public void setDataSource(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarAparelhoProjeto(AparelhoProjeto aparelhamento) {
		log.info("Salvando aparelho...");
		template.update(salvar, aparelhamento.getAparelhoCodigo(), aparelhamento.getProjetoId(),
				aparelhamento.getQuantidade());
	}

	@Override
	public void atualizarAparelhoProjeto(AparelhoProjeto aparelhamento) {
		template.update(atualizar, aparelhamento.getAparelhoCodigo(), aparelhamento.getQuantidade(),
				aparelhamento.getAparelhoCodigo(), aparelhamento.getProjetoId());
	}

	@Override
	public void deletarAparelhoProjeto(AparelhoProjeto aparelhamento) {
		log.info("Deletando aparelho");
		template.update(deletar, aparelhamento.getAparelhoCodigo());

	}

	@Override
	public List<AparelhoProjeto> listarTodosAparelhos() {
		return template.query(listar, this::aparelhoMapRow);
	}

	private AparelhoProjeto aparelhoMapRow(ResultSet rs, int numRow) throws SQLException {
		return new AparelhoProjeto(rs.getString("aparelho_cod"), rs.getLong("projeto_id"), rs.getDouble("quantidade"));
	}

}
