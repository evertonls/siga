package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.DescricaoTipoResultSetExtractor;
import gov.amc.siga.model.DescricaoTipo;

public class DescricaoTipoMapper implements RowMapper<DescricaoTipo>{

	@Override
	public DescricaoTipo mapRow(ResultSet rs, int rowNum) throws SQLException {
		DescricaoTipoResultSetExtractor extractor = new DescricaoTipoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
