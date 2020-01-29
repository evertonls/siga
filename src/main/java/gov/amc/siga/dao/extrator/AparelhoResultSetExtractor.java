package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Aparelho;

public class AparelhoResultSetExtractor implements ResultSetExtractor<Aparelho>{

	@Override
	public Aparelho extractData(ResultSet rs) throws SQLException, DataAccessException {
		Aparelho aparelhamento = new Aparelho();
		aparelhamento.setAparelhamentoCodigo(rs.getString("aparelho_cod"));
		aparelhamento.setProjetoId(rs.getLong("projeto_id"));
		aparelhamento.setQuantidade(rs.getDouble("quantidade"));
		return aparelhamento;
	}

}
