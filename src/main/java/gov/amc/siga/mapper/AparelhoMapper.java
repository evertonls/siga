package gov.amc.siga.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.model.AparelhoTipo;

public class AparelhoMapper implements RowMapper<AparelhoTipo>{

	@Override
	public AparelhoTipo mapRow(ResultSet rs, int line) throws SQLException {
		AparelhoTipoResultSetExtractor extractor = new AparelhoTipoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
