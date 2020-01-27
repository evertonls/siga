package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Classificacao;

public class ClassificacaoResultSetExtractor implements ResultSetExtractor<Classificacao>{

	@Override
	public Classificacao extractData(ResultSet rs) throws SQLException, DataAccessException {
		Classificacao classificacoes = new Classificacao();
		classificacoes.setProjetoId(rs.getLong("projeto_id"));
		classificacoes.setClassificacaoCod(rs.getString("classificacao_tipo"));
		return classificacoes;
	}

}
