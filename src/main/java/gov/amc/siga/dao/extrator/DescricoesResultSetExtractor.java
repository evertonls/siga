package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Descricoes;

public class DescricoesResultSetExtractor implements ResultSetExtractor<Descricoes>{

	@Override
	public Descricoes extractData(ResultSet rs) throws SQLException, DataAccessException {
		Descricoes descricoes = new Descricoes();
		descricoes.setProjetoId(rs.getLong("projeto_id"));
		descricoes.setDescricaoCodigo(rs.getString("descricao_cod"));
		return descricoes;
	}

}
