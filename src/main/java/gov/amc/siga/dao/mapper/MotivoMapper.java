package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.MotivosResultSetExtractor;
import gov.amc.siga.model.Motivos;

public class MotivoMapper implements RowMapper<Motivos>{

	@Override
	public Motivos mapRow(ResultSet rs, int rowNum) throws SQLException {
		MotivosResultSetExtractor extractor = new MotivosResultSetExtractor();
		return extractor.extractData(rs);
	}

}
