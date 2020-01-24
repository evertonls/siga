package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Classificacao;

public class ClassficacoesResultSetExtractor implements ResultSetExtractor<Classificacao>{

	@Override
	public Classificacao extractData(ResultSet rs) throws SQLException, DataAccessException {
		Classificacao classificacoes = new Classificacao();
		classificacoes.setProjetoId(rs.getLong(1));
		classificacoes.setClassificacaoCod(rs.getString(2));
		return classificacoes;
	}

}
