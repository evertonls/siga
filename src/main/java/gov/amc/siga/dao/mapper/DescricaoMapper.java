package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.DescricoesResultSetExtractor;
import gov.amc.siga.model.Descricoes;

public class DescricaoMapper implements RowMapper<Descricoes>{

	@Override
	public Descricoes mapRow(ResultSet rs, int rowNum) throws SQLException {
		DescricoesResultSetExtractor extractor = new DescricoesResultSetExtractor();
		return extractor.extractData(rs);
	}

}
