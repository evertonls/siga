package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.MotivoTipoResultSetExtractor;
import gov.amc.siga.model.MotivoTipo;

public class MotivoTipoMapper implements RowMapper<MotivoTipo>{

	@Override
	public MotivoTipo mapRow(ResultSet rs, int rowNum) throws SQLException {
		MotivoTipoResultSetExtractor extractor = new MotivoTipoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
