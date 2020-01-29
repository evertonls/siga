package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.LongradouroResultSetExtractor;
import gov.amc.siga.model.Longradouro;

public class LongradouroMapper implements RowMapper<Longradouro>{

	@Override
	public Longradouro mapRow(ResultSet rs, int rowNum) throws SQLException {
		LongradouroResultSetExtractor extractor = new LongradouroResultSetExtractor();
		return extractor.extractData(rs);
	}

}
