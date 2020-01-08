package gov.amc.siga.JDBCTemplate;

import java.io.Serializable;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.SetorDao;
import gov.amc.siga.model.Setor;

@Repository
public class SetorJDBCTemplate implements SetorDao, Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private final String query = "SELECT setor_id, setor_cod, setor_desc FROM setores";
	
	public SetorJDBCTemplate(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}
	
	

	@Override
	public Setor getByID(long id) {
		final String sql = query + " WHERE setor_id = ?";
		return template.queryForObject(sql, this::mapSetorRow, id);
	}

	@Override
	public Setor getByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Setor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
