package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.SituacoesResultSetExtractor;
import gov.amc.siga.model.Situacoes;

public class SituacoesMapper implements RowMapper<Situacoes>{

	@Override
	public Situacoes mapRow(ResultSet rs, int rowNum) throws SQLException {
		SituacoesResultSetExtractor extractor = new SituacoesResultSetExtractor();
		return extractor.extractData(rs);
	}

}
