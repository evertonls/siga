package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Equipe;

public class EquipeResultSetExtractor implements ResultSetExtractor<Equipe>{

	@Override
	public Equipe extractData(ResultSet rs) throws SQLException, DataAccessException {
		Equipe equipe = new Equipe();
		equipe.setProjetoId(rs.getLong("projeto_id"));
		equipe.setEquipeCodigo(rs.getString("equipe_cod"));
		return equipe;
	}

}