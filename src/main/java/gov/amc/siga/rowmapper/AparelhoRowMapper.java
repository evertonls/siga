package gov.amc.siga.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.model.Aparelho;

public class AparelhoRowMapper implements RowMapper<Aparelho> {

	@Override
	public Aparelho mapRow(ResultSet rs, int rowNum) throws SQLException {
		Aparelho aparelho = new Aparelho();
		aparelho.setAparelho_cod(rs.getString("aparelho_cod"));
		aparelho.setAparelho_desc(rs.getString("aparelho_desc"));
		return aparelho;
	}

}