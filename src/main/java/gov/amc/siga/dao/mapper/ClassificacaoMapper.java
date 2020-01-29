package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.ClassificacaoResultSetExtractor;
import gov.amc.siga.model.Classificacao;

public class ClassificacaoMapper implements RowMapper<Classificacao>{

	@Override
	public Classificacao mapRow(ResultSet rs, int rowNum) throws SQLException {
		ClassificacaoResultSetExtractor extractor = new ClassificacaoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
