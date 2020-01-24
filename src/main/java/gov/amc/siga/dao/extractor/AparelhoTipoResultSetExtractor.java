package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.AparelhoTipo;

public class AparelhoTipoResultSetExtractor implements ResultSetExtractor<AparelhoTipo>{

	@Override
	public AparelhoTipo extractData(ResultSet rs) throws SQLException, DataAccessException {
		AparelhoTipo aparelhoTipo = new AparelhoTipo();
		aparelhoTipo.setAparelhoCodigo(rs.getString("aparelho_cod"));
		aparelhoTipo.setAparelhoDescricao(rs.getString("aparelho_desc"));
		return aparelhoTipo;
	}

}
