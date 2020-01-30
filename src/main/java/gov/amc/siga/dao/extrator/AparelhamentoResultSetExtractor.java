package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Aparelhamento;

public class AparelhamentoResultSetExtractor implements ResultSetExtractor<Aparelhamento>{

	@Override
	public Aparelhamento extractData(ResultSet rs) throws SQLException, DataAccessException {
		Aparelhamento aparelhamento = new Aparelhamento();
		aparelhamento.setAparelhamentoCodigo(rs.getString("aparelho_cod"));
		aparelhamento.setProjetoId(rs.getLong("projeto_id"));
		aparelhamento.setQuantidade(rs.getDouble("quantidade"));
		return aparelhamento;
	}

}
