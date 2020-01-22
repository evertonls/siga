package gov.amc.siga.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.AparelhoTipo;

public class AparelhoTipoResultSetExtractor implements ResultSetExtractor<AparelhoTipo>{

	@Override
	public AparelhoTipo extractData(ResultSet rs) throws SQLException, DataAccessException {
		AparelhoTipo aparelhoTipo = new AparelhoTipo();
		aparelhoTipo.setAparelhoCodigo(rs.getString(1));
		aparelhoTipo.setAparelhoDescricao(rs.getString(2));
		return aparelhoTipo;
	}

}
