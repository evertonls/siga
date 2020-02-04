package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.EquipeProjeto;

public class EquipeProjetoResultSetExtractor implements ResultSetExtractor<EquipeProjeto>{

	@Override
	public EquipeProjeto extractData(ResultSet rs) throws SQLException, DataAccessException {
		EquipeProjeto equipe = new EquipeProjeto();
		equipe.setEquipeCodigo(rs.getString("equipe_cod"));
		equipe.setProjetoId(rs.getLong("projeto_id"));
		return equipe;
	}

}
