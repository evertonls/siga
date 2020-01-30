package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.LongradourosResultSetExtractor;
import gov.amc.siga.model.Longradouro;

public class LongradouroMapper implements RowMapper<Longradouro>{

	@Override
	public Longradouro mapRow(ResultSet rs, int rowNum) throws SQLException {
		LongradourosResultSetExtractor extractor = new LongradourosResultSetExtractor();
		return extractor.extractData(rs);
	}

}
