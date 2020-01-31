package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.EquipesResultSetExtractor;
import gov.amc.siga.model.Equipes;

public class EquipeMapper implements RowMapper<Equipes>{

	@Override
	public Equipes mapRow(ResultSet rs, int rowNum) throws SQLException {
		EquipesResultSetExtractor extractor = new EquipesResultSetExtractor();
		return extractor.extractData(rs);
	}

}
