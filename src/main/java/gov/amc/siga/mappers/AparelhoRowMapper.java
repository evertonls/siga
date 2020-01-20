package gov.amc.siga.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.daos.extractors.AparelhoResultSetExtractor;
import gov.amc.siga.models.AparelhoTipo;

public class AparelhoRowMapper implements RowMapper<AparelhoTipo> {

	@Override
	public AparelhoTipo mapRow(ResultSet rs, int rowNum) throws SQLException {
		AparelhoResultSetExtractor extractor = new AparelhoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
