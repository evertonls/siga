package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Longradouro;

public class LongradourosResultSetExtractor implements ResultSetExtractor<Longradouro>{

	@Override
	public Longradouro extractData(ResultSet rs) throws SQLException, DataAccessException {
		Longradouro longradouro = new Longradouro();
		longradouro.setLongradouroId(rs.getLong("longradouro_id"));
		longradouro.setJurisdicao(rs.getString("jurisdicao"));
		longradouro.setLongradouro(rs.getString("longradouro"));
		longradouro.setTipo(rs.getString("tipo"));
		longradouro.setTitulo(rs.getString("titulo"));
		
		return null;
	}

}
