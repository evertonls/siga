package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Situacoes;

public class SituacoesResultSetExtractor implements ResultSetExtractor<Situacoes>{

	@Override
	public Situacoes extractData(ResultSet rs) throws SQLException, DataAccessException {
		Situacoes situacao = new Situacoes();
		situacao.setSituacaoCodigo(rs.getString("situacao_cod"));
		situacao.setProjetoId(rs.getLong("projeto_id"));
		return situacao;
	}

}
