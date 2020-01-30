package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Motivos;

public class MotivosResultSetExtractor implements ResultSetExtractor<Motivos> {

	@Override
	public Motivos extractData(ResultSet rs) throws SQLException, DataAccessException {
		Motivos motivo = new Motivos();
		motivo.setMotivoCodigo(rs.getString("motivo_cod"));
		motivo.setProjetoId(rs.getLong("projeto_id"));
		return motivo;
	}

}
