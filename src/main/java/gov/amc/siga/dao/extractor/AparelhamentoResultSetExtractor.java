package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Aparelhamento;

public class AparelhamentoResultSetExtractor implements ResultSetExtractor<Aparelhamento>{

	@Override
	public Aparelhamento extractData(ResultSet rs) throws SQLException, DataAccessException {
		Aparelhamento aparelhamento = new Aparelhamento();
		aparelhamento.setAparelhamentoCodigo(rs.getString(1));
		aparelhamento.setProjetoId(rs.getLong(2));
		aparelhamento.setQuantidade(rs.getDouble(2));
		return aparelhamento;
	}

}
