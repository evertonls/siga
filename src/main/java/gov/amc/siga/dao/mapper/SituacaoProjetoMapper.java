package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.SituacaoProjetoResultSetExtractor;
import gov.amc.siga.model.SituacaoProjeto;

public class SituacaoProjetoMapper implements RowMapper<SituacaoProjeto>{

	@Override
	public SituacaoProjeto mapRow(ResultSet rs, int rowNum) throws SQLException {
		SituacaoProjetoResultSetExtractor extractor = new SituacaoProjetoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
