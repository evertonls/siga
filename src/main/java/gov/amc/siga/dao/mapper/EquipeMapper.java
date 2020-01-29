package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.EquipeResultSetExtractor;
import gov.amc.siga.model.Equipe;

public class EquipeMapper implements RowMapper<Equipe>{

	@Override
	public Equipe mapRow(ResultSet rs, int rowNum) throws SQLException {
		EquipeResultSetExtractor extractor = new EquipeResultSetExtractor();
		return extractor.extractData(rs);
	}

}
