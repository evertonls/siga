package gov.amc.siga.dao.imple;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.BairroDao;
import gov.amc.siga.dao.mapper.BairroMapper;
import gov.amc.siga.model.Bairro;

@Repository
public class BairroDaoImple implements BairroDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate jdbcTemplate;

	private final String sqlSalvarBairro = "INSERT INTO SIGA.BAIRRO (BAIRRO) VALUES (?)";
	private final String sqlAtualizarBairro = "UPDATE SIGA.BAIRRO SET BAIRRO = ? WHERE ID = ?";
	private final String sqlDeletarBairro = "DELETE SIGA.BAIRRO WHERE ID = ?";
	private final String sqlListarTodosBairros = "SELECT BAIRRO FROM SIGA.BAIRRO";

	@Autowired
	public BairroDaoImple(DataSource ds) {
		this.jdbcTemplate = new JdbcTemplate(ds);
	}

	@Override
	public void salvarBairro(String bairro) {
		jdbcTemplate.update(sqlSalvarBairro, new Object[] { bairro });
	}

	@Override
	public void atualizarBairro(Long id, String bairro) {
		jdbcTemplate.update(sqlAtualizarBairro, new Object[] { id, bairro });
	}

	@Override
	public void deletarBairro(Long id) {
		jdbcTemplate.update(sqlDeletarBairro, new Object[] { id });
	}

	@Override
	public List<Bairro> listarTodos() {
		return jdbcTemplate.query(sqlListarTodosBairros, new BairroMapper());

	}

}
