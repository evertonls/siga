package gov.amc.siga.daos.templates;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import gov.amc.siga.daos.AparelhoDAO;
import gov.amc.siga.mappers.AparelhoRowMapper;
import gov.amc.siga.models.Aparelho;

@Component
public class AparelhoJDBCTemplate implements AparelhoDAO, Serializable {

	private static final long serialVersionUID = 1L;

	private final String sqlCreate = "INSERT INTO SIGA.APARELHO_TIPO (APARELHO_COD, APARELHO_DESC) VALUES(?, ?) ON CONFLICT (APARELHO_COD) DO NOTHING";
	private final String sqlListAll = "SELECT APARELHO_COD, APARELHO_DESC FROM SIGA.APARELHO_TIPO";
	private final String sqlDelete = "DELETE FROM SIGA.APARELHO_TIPO WHERE APARELHO_COD = ?";
	private final String sqlUpdate = "UPDATE SIGA.APARELHO_TIPO SET APARELHO_DESC = ? WHERE APARELHO_COD = ?";
	// private final String sqlSelect = "SELECT APARELHO_COD, APARELHO_DESC FROM

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String aparelho_cod, String aparelho_desc) {
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		insert.update(sqlCreate, new Object[] { aparelho_cod, aparelho_desc });

	}

	@Override
	public void delete(String aparelho_cod) {
		JdbcTemplate delete = new JdbcTemplate(dataSource);
		delete.update(sqlDelete, new Object[] { aparelho_cod });
	}

	@Override
	public void update(String aparelho_code, String aparelho_desc) {
		JdbcTemplate select = new JdbcTemplate(dataSource);
		select.update(sqlUpdate, new Object[] { aparelho_code, aparelho_desc });

	}

	@Override
	public List<Aparelho> listAparelhos() {
		JdbcTemplate select = new JdbcTemplate(dataSource);
		return select.query(sqlListAll, new AparelhoRowMapper());
	}

}