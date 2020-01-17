package gov.amc.siga.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.daos.extractors.AparelhoResultSetExtractor;
import gov.amc.siga.models.Aparelho;

public class AparelhoRowMapper implements RowMapper<Aparelho> {

	@Override
	public Aparelho mapRow(ResultSet rs, int rowNum) throws SQLException {
		AparelhoResultSetExtractor extractor = new AparelhoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
