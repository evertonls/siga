package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.AparelhoProjetoDao;
import gov.amc.siga.dao.mapper.AparelhoProjetoMapper;
import gov.amc.siga.model.AparelhoProjeto;

@Repository
public class AparelhoProjetoDaoImplementacao implements AparelhoProjetoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public void salvarAparelhoProjeto(AparelhoProjeto aparelhamento) {
		final String query = "INSERT INTO siga.aparelho_projeto (aparelho_cod, projeto_id, quantidade) VALUES (? , ?, ?)";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { aparelhamento.getAparelhamentoCodigo().toUpperCase(),
				aparelhamento.getProjetoId(), aparelhamento.getQuantidade() };
		int out = template.update(query, args);
		if (out != 0) {
			System.out.println("Aparelhamento salvo!");
		} else {
			System.out.println("Falha ao salvar Aparelhamento!");
		}
	}

	@Override
	public void atualizarAparelhoProjeto(AparelhoProjeto aparelhamento) {
		final String query = "UPDATE siga.aparelhamentos SET aparelho_cod=?, quantidade=? WHERE aparelhamento_id=?";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { aparelhamento.getAparelhamentoCodigo().toUpperCase(),
				aparelhamento.getQuantidade(), aparelhamento.getProjetoId() };
		int out = template.update(query, args);
		if (out != 0) {
			System.out.println("Aparelhamento atualizado!");
		} else {
			System.out.println("Falha ao atualizar o Aparelhamento!");
		}
	}

	@Override
	public void deletarAparelhoProjeto(AparelhoProjeto aparelhamento) {
		
		final String query = "DELETE FROM siga.aparelho_projeto WHERE aparelho_id=?";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { aparelhamento.getAparelhamentoId() };
		int out = template.update(query, args);
		if (out != 0) {
			System.out.println("Aparelhamento Deletado!");
		} else {
			System.out.println("Falha ao deletar Aparelhamento!");
		}
	}

	@Override
	public List<AparelhoProjeto> listarTodosAparelhos() {
		final String query = "SELECT aparelho_id, aparelho_cod, projeto_id, quantidade FROM siga.aparelho_projeto";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		return template.query(query, new AparelhoProjetoMapper());
	}

}
