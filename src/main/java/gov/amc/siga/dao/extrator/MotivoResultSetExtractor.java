package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Motivo;

public class MotivoResultSetExtractor implements ResultSetExtractor<Motivo> {

	@Override
	public Motivo extractData(ResultSet rs) throws SQLException, DataAccessException {
		Motivo motivo = new Motivo();
		motivo.setMotivoCodigo(rs.getString("motivo_cod"));
		motivo.setProjetoId(rs.getLong("projeto_id"));
		return motivo;
	}

}
