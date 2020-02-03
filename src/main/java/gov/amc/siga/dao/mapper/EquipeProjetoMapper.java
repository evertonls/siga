package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.EquipeProjetoResultSetExtractor;
import gov.amc.siga.model.EquipeProjeto;

public class EquipeProjetoMapper implements RowMapper<EquipeProjeto>{

	@Override
	public EquipeProjeto mapRow(ResultSet rs, int rowNum) throws SQLException {
		EquipeProjetoResultSetExtractor extractor = new EquipeProjetoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
