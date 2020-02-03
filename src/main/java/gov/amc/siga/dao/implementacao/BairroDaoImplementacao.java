package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.BairroDao;
import gov.amc.siga.dao.mapper.BairroMapper;
import gov.amc.siga.model.Bairro;

@Repository
public class BairroDaoImplementacao implements BairroDao, Serializable {

	private static final long serialVersionUID = 1L;
	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public void salvarBairro(Bairro bairro) {
		final String query = "INSERT INTO siga.bairros ( bairro ) VALUES( ? );";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { bairro.getBairro().toUpperCase() };
		int out = template.update(query, args);
		if (out != 0) {
			System.out.println("Bairro salvo!");
		} else {
			System.out.println("Falha ao salvar o bairro!");
		}
	}

	@Override
	public void atualizarBairro(Bairro bairro) {
		final String query = "UPDATE siga.bairros SET bairro=? WHERE bairro_id= ?";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { bairro.getBairro().toUpperCase(), bairro.getBairroId() };
		int out = template.update(query, args);
		if (out != 0) {
			System.out.println("Bairro atualizado!");
		} else {
			System.out.println("Falha ao atualizar bairro!");
		}
	}

	@Override
	public void deletarBairro(Bairro bairro) {
		final String query = "DELETE FROM siga.bairros WHERE bairro_id= ?";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { bairro.getBairroId() };
		int out = template.update(query, args);
		if (out != 0) {
			System.out.println("Bairro deletado!!");
		} else {
			System.out.println("Falha ao deletar bairro!");
		}
	}

	@Override
	public List<Bairro> listarTodosBairros() {
		final String query = "SELECT bairro_id, bairro FROM siga.bairros";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		return template.query(query, new BairroMapper());
	}

}
