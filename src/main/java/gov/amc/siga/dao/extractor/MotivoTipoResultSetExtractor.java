package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.MotivoTipo;

public class MotivoTipoResultSetExtractor implements ResultSetExtractor<MotivoTipo>{

	@Override
	public MotivoTipo extractData(ResultSet rs) throws SQLException, DataAccessException {
		MotivoTipo motivoTipo = new MotivoTipo();
		motivoTipo.setMotivoCodigo(rs.getString("motivo_cod"));
		motivoTipo.setMotivoDescricao(rs.getString("motivo_desc"));
		return motivoTipo;
	}

}
