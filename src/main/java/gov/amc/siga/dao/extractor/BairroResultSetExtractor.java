package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Bairro;

public class BairroResultSetExtractor implements ResultSetExtractor<Bairro> {

	@Override
	public Bairro extractData(ResultSet rs) throws SQLException, DataAccessException {
		Bairro bairro = new Bairro();
		bairro.setbairroId(rs.getLong("bairro_id"));
		bairro.setBairro(rs.getString("bairro"));
		return bairro;
	}

}
