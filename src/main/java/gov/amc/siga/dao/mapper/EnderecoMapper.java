package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.EnderecoResultSetExtractor;
import gov.amc.siga.model.Endereco;

public class EnderecoMapper implements RowMapper<Endereco>{

	@Override
	public Endereco mapRow(ResultSet rs, int rowNum) throws SQLException {
		EnderecoResultSetExtractor extractor = new EnderecoResultSetExtractor();
		return extractor.extractData(rs);
	}

}
