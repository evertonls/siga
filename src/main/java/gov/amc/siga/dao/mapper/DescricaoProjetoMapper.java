package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.DescricaoProjetoResultSetExtractor;
import gov.amc.siga.model.DescricaoProjeto;

public class DescricaoProjetoMapper implements RowMapper<DescricaoProjeto>{

	@Override
	public DescricaoProjeto mapRow(ResultSet rs, int rowNum) throws SQLException {
		DescricaoProjetoResultSetExtractor extractor = new DescricaoProjetoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
