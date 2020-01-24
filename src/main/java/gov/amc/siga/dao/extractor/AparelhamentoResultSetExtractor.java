package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Aparelho;

public class AparelhamentoResultSetExtractor implements ResultSetExtractor<Aparelho>{

	@Override
	public Aparelho extractData(ResultSet rs) throws SQLException, DataAccessException {
		Aparelho aparelhamento = new Aparelho();
		aparelhamento.setAparelhamentoCodigo(rs.getString(1));
		aparelhamento.setProjetoId(rs.getLong(2));
		aparelhamento.setQuantidade(rs.getDouble(2));
		return aparelhamento;
	}

}
