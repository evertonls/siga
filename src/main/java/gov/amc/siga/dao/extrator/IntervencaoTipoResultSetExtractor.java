package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.IntervencaoTipo;

public class IntervencaoTipoResultSetExtractor implements ResultSetExtractor<IntervencaoTipo>{

	@Override
	public IntervencaoTipo extractData(ResultSet rs) throws SQLException, DataAccessException {
		IntervencaoTipo intervencaoTipo = new IntervencaoTipo();
		intervencaoTipo.setIntervencaoTipoId(rs.getLong("intervencao_id"));
		intervencaoTipo.setIntervencaoCodigo(rs.getString("intervencao_cod"));
		intervencaoTipo.setIntervencaoDescricao(rs.getString("intervencao_desc"));
		return intervencaoTipo;
	}

}
