package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.DescricaoResultSetExtractor;
import gov.amc.siga.model.Descricao;

public class DescricaoMapper implements RowMapper<Descricao>{

	@Override
	public Descricao mapRow(ResultSet rs, int rowNum) throws SQLException {
		DescricaoResultSetExtractor extractor = new DescricaoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
