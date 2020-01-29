package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.AparelhoTipoResultSetExtractor;
import gov.amc.siga.model.AparelhoTipo;

public class AparelhoTipoMapper implements RowMapper<AparelhoTipo>{

	@Override
	public AparelhoTipo mapRow(ResultSet rs, int line) throws SQLException {
		AparelhoTipoResultSetExtractor extractor = new AparelhoTipoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
