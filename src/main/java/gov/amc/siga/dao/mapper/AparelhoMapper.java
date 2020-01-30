package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.AparelhamentoResultSetExtractor;
import gov.amc.siga.model.Aparelhamento;

public class AparelhoMapper implements RowMapper<Aparelhamento>{

	@Override
	public Aparelhamento mapRow(ResultSet rs, int rowNum) throws SQLException {
		AparelhamentoResultSetExtractor extractor = new AparelhamentoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
