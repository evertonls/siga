package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.SituacaoResultSetExtractor;
import gov.amc.siga.model.Situacao;

public class SituacaoMapper implements RowMapper<Situacao>{

	@Override
	public Situacao mapRow(ResultSet rs, int rowNum) throws SQLException {
		SituacaoResultSetExtractor extractor = new SituacaoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
