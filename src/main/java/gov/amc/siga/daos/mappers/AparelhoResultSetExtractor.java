package gov.amc.siga.daos.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.models.AparelhoTipo;

public class AparelhoResultSetExtractor implements ResultSetExtractor<AparelhoTipo>{

	@Override
	public AparelhoTipo extractData(ResultSet rs) throws SQLException, DataAccessException {
		AparelhoTipo aparelho = new AparelhoTipo();
		aparelho.setAparelhoCodigo(rs.getString(1));
		aparelho.setAparelhoDescricao(rs.getString(2));
		return aparelho;
	}

	
}
