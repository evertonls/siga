package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.MotivoProjeto;

public class MotivoProjetoResultSetExtractor implements ResultSetExtractor<MotivoProjeto> {

	@Override
	public MotivoProjeto extractData(ResultSet rs) throws SQLException, DataAccessException {
		MotivoProjeto motivo = new MotivoProjeto();
		motivo.setMotivosId(rs.getLong("motivo_id"));
		motivo.setMotivoCodigo(rs.getString("motivo_cod"));
		motivo.setProjetoId(rs.getLong("projeto_id"));
		return motivo;
	}

}
