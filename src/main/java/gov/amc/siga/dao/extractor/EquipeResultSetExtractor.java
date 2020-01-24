package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Equipe;

public class EquipeResultSetExtractor implements ResultSetExtractor<Equipe>{

	@Override
	public Equipe extractData(ResultSet rs) throws SQLException, DataAccessException {
		Equipe equipe = new Equipe();
		equipe.setProjetoId(rs.getLong(1));
		equipe.setEquipeCod(rs.getString(2));
		return equipe;
	}

}
