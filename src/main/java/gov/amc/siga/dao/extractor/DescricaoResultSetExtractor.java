package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Descricao;

public class DescricaoResultSetExtractor implements ResultSetExtractor<Descricao>{

	@Override
	public Descricao extractData(ResultSet rs) throws SQLException, DataAccessException {
		Descricao descricoes = new Descricao();
		descricoes.setProjetoId(rs.getLong("projeto_id"));
		descricoes.setDescricaoCodigo(rs.getString("descricao_cod"));
		return descricoes;
	}

}
