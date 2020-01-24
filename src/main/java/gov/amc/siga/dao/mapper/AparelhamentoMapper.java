package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.AparelhamentoResultSetExtractor;
import gov.amc.siga.model.Aparelho;

public class AparelhamentoMapper implements RowMapper<Aparelho>{

	@Override
	public Aparelho mapRow(ResultSet rs, int rowNum) throws SQLException {
		AparelhamentoResultSetExtractor extractor = new AparelhamentoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
