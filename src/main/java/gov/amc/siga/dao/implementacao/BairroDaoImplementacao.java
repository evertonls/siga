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
	private String sqlSalvarBairro = "INSERT INTO siga.bairros ( bairro ) VALUES( ? );";
	private String sqlAtualizarBairro = "UPDATE siga.bairros SET bairro=? WHERE bairro_id= ?";
	private String sqlDeletarBairro = "DELETE FROM siga.bairros WHERE bairro_id= ?";
	private String sqlListarTodosBairros = "SELECT bairro_id, bairro FROM siga.bairros";
	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public void salvarBairro(String bairro) {
		JdbcTemplate salvar = new JdbcTemplate(dataSource);
		salvar.update(sqlSalvarBairro, new Object[] { bairro });
	}

	@Override
	public void atualizarBairro(Long bairroId, String bairro) {
		JdbcTemplate atualizar = new JdbcTemplate(dataSource);
		atualizar.update(sqlAtualizarBairro, new Object[] { bairro, bairroId });
	}

	@Override
	public void deletarBairro(Long bairroId) {
		JdbcTemplate deletar = new JdbcTemplate(dataSource);
		deletar.update(sqlDeletarBairro, new Object[] { bairroId });
	}

	@Override
	public List<Bairro> listarTodosBairros() {
		JdbcTemplate listar = new JdbcTemplate(dataSource);
		return listar.query(sqlListarTodosBairros, new BairroMapper());
	}
}
