package gov.amc.siga.JDBCTemplate;

import java.io.Serializable;
import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.AparelhoDao;
import gov.amc.siga.model.Aparelho;

@Repository
public class AparelhoJBDCTemplate implements AparelhoDao, Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private final String query = "SELECT aparelho_cod, aparelho_desc FROM aparelho_tipo";

	@Autowired
	public void AparelhoJDBCTemplate(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public Aparelho getByCode(String aparelho_cod) {
		final String sql = query + "WHERE aparelho_cod = ?";
		return template.queryForObject(sql, this::mapAparelhoRow, aparelho_cod);
	}

	@Override
	public HashMap<String, Aparelho> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
