package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.MotivoResultSetExtractor;
import gov.amc.siga.model.Motivo;

public class MotivoMapper implements RowMapper<Motivo>{

	@Override
	public Motivo mapRow(ResultSet rs, int rowNum) throws SQLException {
		MotivoResultSetExtractor extractor = new MotivoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
