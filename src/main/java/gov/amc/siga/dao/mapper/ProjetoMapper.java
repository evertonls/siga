package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extractor.ProjetoResultSetExtractor;
import gov.amc.siga.model.Projeto;

public class ProjetoMapper implements RowMapper<Projeto>{

	@Override
	public Projeto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProjetoResultSetExtractor extractor = new ProjetoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
