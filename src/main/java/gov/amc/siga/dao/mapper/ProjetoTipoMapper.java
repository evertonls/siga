package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.ProjetoTipoResultSetExtractor;
import gov.amc.siga.model.ProjetoTipo;

public class ProjetoTipoMapper implements RowMapper<ProjetoTipo>{

	@Override
	public ProjetoTipo mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProjetoTipoResultSetExtractor extractor = new ProjetoTipoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
