package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.MotivoProjetoResultSetExtractor;
import gov.amc.siga.model.MotivoProjeto;

public class MotivoProjetoMapper implements RowMapper<MotivoProjeto>{

	@Override
	public MotivoProjeto mapRow(ResultSet rs, int rowNum) throws SQLException {
		MotivoProjetoResultSetExtractor extractor = new MotivoProjetoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
