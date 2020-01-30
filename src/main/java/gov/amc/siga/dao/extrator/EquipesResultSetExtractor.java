package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Equipes;

public class EquipesResultSetExtractor implements ResultSetExtractor<Equipes>{

	@Override
	public Equipes extractData(ResultSet rs) throws SQLException, DataAccessException {
		Equipes equipe = new Equipes();
		equipe.setProjetoId(rs.getLong("projeto_id"));
		equipe.setEquipeCodigo(rs.getString("equipe_cod"));
		return equipe;
	}

}
