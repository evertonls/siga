package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Situacao;

public class SituacaoResultSetExtractor implements ResultSetExtractor<Situacao>{

	@Override
	public Situacao extractData(ResultSet rs) throws SQLException, DataAccessException {
		Situacao situacao = new Situacao();
		situacao.setSituacaoCodigo(rs.getString("situacao_cod"));
		situacao.setProjetoId(rs.getLong("projeto_id"));
		return situacao;
	}

}
