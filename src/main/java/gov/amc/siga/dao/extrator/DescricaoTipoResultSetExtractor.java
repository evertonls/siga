package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.DescricaoTipo;

public class DescricaoTipoResultSetExtractor implements ResultSetExtractor<DescricaoTipo>{

	@Override
	public DescricaoTipo extractData(ResultSet rs) throws SQLException, DataAccessException {
		DescricaoTipo descricaoTipo = new DescricaoTipo();
		descricaoTipo.setDescricaoId(rs.getLong("descricao_id"));
		descricaoTipo.setDescricaoCodigo(rs.getString("descricao_cod"));
		descricaoTipo.setDescricaoDescricao(rs.getString("descricao_desc"));
		return descricaoTipo;
	}

}
