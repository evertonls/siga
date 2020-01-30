package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Intervencoes;

public class IntervencoesResultSetExtractor implements ResultSetExtractor<Intervencoes>{

	@Override
	public Intervencoes extractData(ResultSet rs) throws SQLException, DataAccessException {
		Intervencoes intervencao = new Intervencoes();
		intervencao.setProjetoId(rs.getLong("projeto_id"));
		intervencao.setIntervencaoCodigo(rs.getString("intervencao_cod"));
		intervencao.setQuantidade(rs.getInt("quantidade"));
		return null;
	}

}
