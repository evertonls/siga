package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.ProjetoTipo;

public class ProjetoTipoResultSetExtractor implements ResultSetExtractor<ProjetoTipo>{

	@Override
	public ProjetoTipo extractData(ResultSet rs) throws SQLException, DataAccessException {
		ProjetoTipo projetoTipo = new ProjetoTipo();
		projetoTipo.setProjetoTipoId(rs.getLong("tipo_id"));
		projetoTipo.setProjetoTipoCodigo(rs.getString("tipo_cod"));
		projetoTipo.setProjetoTipoDescricao(rs.getString("tipo_desc"));
		return projetoTipo;
	}

}
