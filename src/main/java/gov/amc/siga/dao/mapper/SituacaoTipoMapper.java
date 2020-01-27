package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.SituacaoTipoResultSetExtractor;
import gov.amc.siga.model.SituacaoTipo;

public class SituacaoTipoMapper implements RowMapper<SituacaoTipo>{

	@Override
	public SituacaoTipo mapRow(ResultSet rs, int rowNum) throws SQLException {
		SituacaoTipoResultSetExtractor extractor = new SituacaoTipoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
