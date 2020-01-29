package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Intervencao;

public class IntervencaoResultSetExtractor implements ResultSetExtractor<Intervencao>{

	@Override
	public Intervencao extractData(ResultSet rs) throws SQLException, DataAccessException {
		Intervencao intervencao = new Intervencao();
		intervencao.setProjetoId(rs.getLong("projeto_id"));
		intervencao.setIntervencaoCodigo(rs.getString("intervencao_cod"));
		intervencao.setQuantidade(rs.getInt("quantidade"));
		return null;
	}

}
