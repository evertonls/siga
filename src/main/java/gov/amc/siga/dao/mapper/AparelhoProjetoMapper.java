package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.AparelhoProjetoResultSetExtractor;
import gov.amc.siga.model.AparelhoProjeto;

public class AparelhoProjetoMapper implements RowMapper<AparelhoProjeto>{

	@Override
	public AparelhoProjeto mapRow(ResultSet rs, int rowNum) throws SQLException {
		AparelhoProjetoResultSetExtractor extractor = new AparelhoProjetoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
