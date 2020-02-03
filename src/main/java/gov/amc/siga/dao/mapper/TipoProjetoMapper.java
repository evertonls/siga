package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.TipoProjetoResultSetExtractor;
import gov.amc.siga.model.TipoProjeto;

public class TipoProjetoMapper implements RowMapper<TipoProjeto>{

	@Override
	public TipoProjeto mapRow(ResultSet rs, int rowNum) throws SQLException {
		TipoProjetoResultSetExtractor extractor = new TipoProjetoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
