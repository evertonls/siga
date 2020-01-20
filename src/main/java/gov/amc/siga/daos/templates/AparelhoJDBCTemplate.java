package gov.amc.siga.daos.templates;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import gov.amc.siga.daos.interfaces.AparelhoDAO;
import gov.amc.siga.mappers.AparelhoRowMapper;
import gov.amc.siga.models.AparelhoTipo;

@Component
public class AparelhoJDBCTemplate implements AparelhoDAO, Serializable {

	private static final long serialVersionUID = 1L;

	private final String sqlSalvar = "INSERT INTO SIGA.APARELHO_TIPO (APARELHO_COD, APARELHO_DESC) VALUES(?, ?) ON CONFLICT (APARELHO_COD) DO NOTHING";
	private final String sqlListarTodos = "SELECT APARELHO_COD, APARELHO_DESC FROM SIGA.APARELHO_TIPO";
	private final String sqlDeletar = "DELETE FROM SIGA.APARELHO_TIPO WHERE APARELHO_COD = ?";
	private final String sqlAtualizar = "UPDATE SIGA.APARELHO_TIPO SET APARELHO_DESC = ? WHERE APARELHO_COD = ?";

	@Autowired
	private DataSource dataSource;

	@SuppressWarnings("unused")
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void salvar(String aparelhoCodigo, String aparelhoDescricao) {
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		insert.update(sqlSalvar, new Object[] { aparelhoCodigo, aparelhoDescricao });

	}

	@Override
	public void deletar(String aparelhoCodigo) {
		JdbcTemplate deletar = new JdbcTemplate(dataSource);
		deletar.update(sqlDeletar, new Object[] { aparelhoCodigo });
	}

	@Override
	public void atualizar(String aparelhoCodigo, String aparelhoDescricao) {
		JdbcTemplate select = new JdbcTemplate(dataSource);
		select.update(sqlAtualizar, new Object[] { aparelhoCodigo, aparelhoDescricao });

	}

	@Override
	public List<AparelhoTipo> listarAparelhos() {
		JdbcTemplate select = new JdbcTemplate(dataSource);
		return select.query(sqlListarTodos, new AparelhoRowMapper());
	}

}
