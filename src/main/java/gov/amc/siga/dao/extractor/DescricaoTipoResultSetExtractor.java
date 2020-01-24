package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.DescricaoTipo;

public class DescricaoTipoResultSetExtractor implements ResultSetExtractor<DescricaoTipo>{

	@Override
	public DescricaoTipo extractData(ResultSet rs) throws SQLException, DataAccessException {
		DescricaoTipo descricaoTipo = new DescricaoTipo();
		descricaoTipo.setDescricaoCodigo(rs.getString(1));
		descricaoTipo.setDescricaoDescricao(rs.getString(2));
		return descricaoTipo;
	}

}
