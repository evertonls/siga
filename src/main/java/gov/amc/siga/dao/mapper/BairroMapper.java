package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.BairroResultSetExtractor;
import gov.amc.siga.model.Bairro;

public class BairroMapper implements RowMapper<Bairro>{

	@Override
	public Bairro mapRow(ResultSet rs, int rowNum) throws SQLException {
		BairroResultSetExtractor extractor = new BairroResultSetExtractor();
		return extractor.extractData(rs);
	}

}
