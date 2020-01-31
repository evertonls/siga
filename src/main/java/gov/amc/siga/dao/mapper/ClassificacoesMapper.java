package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.ClassificacoesResultSetExtractor;
import gov.amc.siga.model.Classificacoes;

public class ClassificacoesMapper implements RowMapper<Classificacoes>{

	@Override
	public Classificacoes mapRow(ResultSet rs, int rowNum) throws SQLException {
		ClassificacoesResultSetExtractor extractor = new ClassificacoesResultSetExtractor();
		return extractor.extractData(rs);
	}

}
