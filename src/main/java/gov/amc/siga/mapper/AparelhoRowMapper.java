package gov.amc.siga.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.AparelhoResultSetExtractor;
import gov.amc.siga.model.Aparelho;

public class AparelhoRowMapper implements RowMapper<Aparelho> {

	@Override
	public Aparelho mapRow(ResultSet rs, int rowNum) throws SQLException {
		AparelhoResultSetExtractor extractor = new AparelhoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
