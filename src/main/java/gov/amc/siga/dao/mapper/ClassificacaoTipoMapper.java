package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.CLassificacaoTipoResultSetExtractor;
import gov.amc.siga.model.ClassificacaoTipo;

public class ClassificacaoTipoMapper implements RowMapper<ClassificacaoTipo>{

	@Override
	public ClassificacaoTipo mapRow(ResultSet rs, int rowNum) throws SQLException {
		CLassificacaoTipoResultSetExtractor extractor = new CLassificacaoTipoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
