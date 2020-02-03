package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.IntervencaoProjeto;

public class IntervencaoProjetoResultSetExtractor implements ResultSetExtractor<IntervencaoProjeto>{

	@Override
	public IntervencaoProjeto extractData(ResultSet rs) throws SQLException, DataAccessException {
		IntervencaoProjeto intervencao = new IntervencaoProjeto();
		intervencao.setIntervencoesId(rs.getLong("intervencoes_id"));
		intervencao.setIntervencaoCodigo(rs.getString("intervencao_cod"));
		intervencao.setProjetoId(rs.getLong("projeto_id"));
		intervencao.setQuantidade(rs.getInt("quantidade"));
		return null;
	}

}
