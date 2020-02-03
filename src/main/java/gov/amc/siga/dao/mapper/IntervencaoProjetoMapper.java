package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.IntervencaoProjetoResultSetExtractor;
import gov.amc.siga.model.IntervencaoProjeto;

public class IntervencaoProjetoMapper implements RowMapper<IntervencaoProjeto>{

	@Override
	public IntervencaoProjeto mapRow(ResultSet rs, int rowNum) throws SQLException {
		IntervencaoProjetoResultSetExtractor extractor = new IntervencaoProjetoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
