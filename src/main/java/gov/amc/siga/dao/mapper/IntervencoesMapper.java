package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.IntervencoesResultSetExtractor;
import gov.amc.siga.model.Intervencoes;

public class IntervencoesMapper implements RowMapper<Intervencoes>{

	@Override
	public Intervencoes mapRow(ResultSet rs, int rowNum) throws SQLException {
		IntervencoesResultSetExtractor extractor = new IntervencoesResultSetExtractor();
		return extractor.extractData(rs);
	}

}
