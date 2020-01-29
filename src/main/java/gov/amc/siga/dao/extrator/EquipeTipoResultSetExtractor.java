package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.EquipeTipo;

public class EquipeTipoResultSetExtractor implements ResultSetExtractor<EquipeTipo> {

	@Override
	public EquipeTipo extractData(ResultSet rs) throws SQLException, DataAccessException {
		EquipeTipo equipeTipo = new EquipeTipo();
		equipeTipo.setEquipeCodigo(rs.getString("equipe_cod"));
		equipeTipo.setEquipeDescricao(rs.getString("equipe_desc"));
		return equipeTipo;
	}

}