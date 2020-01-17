package gov.amc.siga.daos.templates;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.daos.SetorDAO;
import gov.amc.siga.models.Setor;

@Repository
public class SetorJDBCTemplate implements Serializable, SetorDAO {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private final String query = "SELECT setor_id, setor_cod, setor_desc FROM setores";

	public SetorJDBCTemplate(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public Setor getById(long id) {
		final String sql = query + " WHERE setor_id = ?";
		return template.queryForObject(sql, this::mapSetorRow, id);
	}

	@Override
	public Setor getByCode(String code) {
		final String sql = query + " WHERE setor_cod = ?";
		return template.queryForObject(sql, this::mapSetorRow, code);
	}

	@Override
	public Iterable<Setor> getAll() {
		return template.query(query, this::mapSetorRow);
	}

	private Setor mapSetorRow(ResultSet rs, int numRow) throws SQLException {
		return new Setor(rs.getLong("setor_id"), rs.getString("setor_cod"), rs.getString("setor_desc"));
	}

}
