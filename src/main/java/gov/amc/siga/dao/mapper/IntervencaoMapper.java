package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.IntervencaoResultSetExtractor;
import gov.amc.siga.model.Intervencao;

public class IntervencaoMapper implements RowMapper<Intervencao>{

	@Override
	public Intervencao mapRow(ResultSet rs, int rowNum) throws SQLException {
		IntervencaoResultSetExtractor extractor = new IntervencaoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
