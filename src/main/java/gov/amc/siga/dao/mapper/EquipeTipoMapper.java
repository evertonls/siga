package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.EquipeTipoResultSetExtractor;
import gov.amc.siga.model.EquipeTipo;

public class EquipeTipoMapper implements RowMapper<EquipeTipo>{

	@Override
	public EquipeTipo mapRow(ResultSet rs, int rowNum) throws SQLException {
		EquipeTipoResultSetExtractor extractor = new EquipeTipoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
