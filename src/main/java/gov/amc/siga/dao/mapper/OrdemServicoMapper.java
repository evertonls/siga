package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.OrdemServicoResultSetExtractor;
import gov.amc.siga.model.OrdemServico;

public class OrdemServicoMapper implements RowMapper<OrdemServico>{

	@Override
	public OrdemServico mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrdemServicoResultSetExtractor extractor = new OrdemServicoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
