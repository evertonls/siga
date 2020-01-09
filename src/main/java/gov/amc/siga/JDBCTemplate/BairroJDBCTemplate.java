package gov.amc.siga.JDBCTemplate;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.BairroDao;
import gov.amc.siga.model.Bairro;

@Repository
public class BairroJDBCTemplate implements BairroDao, Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private final String query = "SELECT BAIRRO_ID, BAIRRO FROM bairros b";

	public BairroJDBCTemplate(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public Bairro getById(Long id) {
		final String sql = query + "WHERE bairro_id = ?";
		return template.queryForObject(sql, this::mapBairroRow);
	}
	
	@Override
	public Bairro getByBairro(String bairro) {
		final String sql = query + "WHERE bairro = ?";
		return template.queryForObject(sql, this::mapBairroRow);
	}
	
	private Bairro mapBairroRow (ResultSet rs, int numRow) throws SQLException {
		return new Bairro(rs.getLong("bairro_id"), rs.getString("bairro"));
	}

	@Override
	public List<Bairro> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
