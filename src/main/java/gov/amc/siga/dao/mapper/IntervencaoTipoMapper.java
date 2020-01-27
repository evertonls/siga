package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.IntervencaoTipoResultSetExtractor;
import gov.amc.siga.model.IntervencaoTipo;

public class IntervencaoTipoMapper implements RowMapper<IntervencaoTipo>{

	@Override
	public IntervencaoTipo mapRow(ResultSet rs, int rowNum) throws SQLException {
		IntervencaoTipoResultSetExtractor extractor = new IntervencaoTipoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
