package gov.amc.siga.dao.extractors;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.models.Aparelho;

public class AparelhoResultSetExtractor implements ResultSetExtractor<Aparelho>{

	@Override
	public Aparelho extractData(ResultSet rs) throws SQLException, DataAccessException {
		Aparelho aparelho = new Aparelho();
		aparelho.setAparelho_cod(rs.getString(1));
		aparelho.setAparelho_desc(rs.getString(2));
		return aparelho;
	}

}
