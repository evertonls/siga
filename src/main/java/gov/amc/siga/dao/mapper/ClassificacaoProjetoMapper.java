package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.ClassificacaoProjetoResultSetExtractor;
import gov.amc.siga.model.ClassificacaoProjeto;

public class ClassificacaoProjetoMapper implements RowMapper<ClassificacaoProjeto>{

	@Override
	public ClassificacaoProjeto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ClassificacaoProjetoResultSetExtractor extractor = new ClassificacaoProjetoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
