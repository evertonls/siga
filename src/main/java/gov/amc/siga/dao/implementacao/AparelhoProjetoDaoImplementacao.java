package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.AparelhoProjetoDao;
import gov.amc.siga.dao.mapper.AparelhoProjetoMapper;
import gov.amc.siga.model.AparelhoProjeto;

@Repository
public class AparelhoProjetoDaoImplementacao implements AparelhoProjetoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log= LoggerFactory.getLogger(getClass()); 

	@Override
	public void setDataSource(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarAparelhoProjeto(AparelhoProjeto aparelhamento) {
		final String query = "INSERT INTO siga.aparelho_projeto (aparelho_cod, projeto_id, quantidade) VALUES (? , ?, ?)";
		Object[] args = new Object[] { aparelhamento.getAparelhamentoCodigo().toUpperCase(),
				aparelhamento.getProjetoId(), aparelhamento.getQuantidade() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Aparelhamento salvo!");
		} else {
			log.info("Falha ao salvar Aparelhamento!");
		}
	}

	@Override
	public void atualizarAparelhoProjeto(AparelhoProjeto aparelhamento) {
		final String query = "UPDATE siga.aparelho_projeto SET aparelho_cod=?, quantidade=? WHERE aparelhamento_id=?";
		Object[] args = new Object[] { aparelhamento.getAparelhamentoCodigo().toUpperCase(),
				aparelhamento.getQuantidade(), aparelhamento.getProjetoId() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Aparelhamento atualizado!");
		} else {
			log.info("Falha ao atualizar o Aparelhamento!");
		}
	}

	@Override
	public void deletarAparelhoProjeto(AparelhoProjeto aparelhamento) {
		
		final String query = "DELETE FROM siga.aparelho_projeto WHERE aparelho_id=?";
		Object[] args = new Object[] { aparelhamento.getAparelhamentoCodigo() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Aparelhamento Deletado!");
		} else {
			log.info("Falha ao deletar Aparelhamento!");
		}
	}

	@Override
	public List<AparelhoProjeto> listarTodosAparelhos() {
		final String query = "SELECT aparelho_id, aparelho_cod, projeto_id, quantidade FROM siga.aparelho_projeto";
		return template.query(query, new AparelhoProjetoMapper());
	}

}
