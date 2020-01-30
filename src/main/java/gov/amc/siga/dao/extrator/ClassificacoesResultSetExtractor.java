package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Classificacoes;

public class ClassificacoesResultSetExtractor implements ResultSetExtractor<Classificacoes>{

	@Override
	public Classificacoes extractData(ResultSet rs) throws SQLException, DataAccessException {
		Classificacoes classificacoes = new Classificacoes();
		classificacoes.setProjetoId(rs.getLong("projeto_id"));
		classificacoes.setClassificacaoCod(rs.getString("classificacao_cod"));
		return classificacoes;
	}

}
