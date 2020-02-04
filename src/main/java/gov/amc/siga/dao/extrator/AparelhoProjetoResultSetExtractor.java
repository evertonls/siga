package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.AparelhoProjeto;

public class AparelhoProjetoResultSetExtractor implements ResultSetExtractor<AparelhoProjeto>{

	@Override
	public AparelhoProjeto extractData(ResultSet rs) throws SQLException, DataAccessException {
		AparelhoProjeto aparelhamento = new AparelhoProjeto();
		aparelhamento.setAparelhamentoCodigo(rs.getString("aparelho_cod"));
		aparelhamento.setProjetoId(rs.getLong("projeto_id"));
		aparelhamento.setQuantidade(rs.getDouble("quantidade"));
		return aparelhamento;
	}

}
