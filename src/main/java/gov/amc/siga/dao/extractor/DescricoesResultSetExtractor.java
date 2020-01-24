package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Descricao;

public class DescricoesResultSetExtractor implements ResultSetExtractor<Descricao>{

	@Override
	public Descricao extractData(ResultSet rs) throws SQLException, DataAccessException {
		Descricao descricoes = new Descricao();
		descricoes.setProjetoId(rs.getLong(1));
		descricoes.setDescricaoCodigo(rs.getString(2));
		return descricoes;
	}

}
