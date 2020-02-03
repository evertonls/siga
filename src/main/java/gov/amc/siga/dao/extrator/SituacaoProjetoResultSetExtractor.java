package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.SituacaoProjeto;

public class SituacaoProjetoResultSetExtractor implements ResultSetExtractor<SituacaoProjeto>{

	@Override
	public SituacaoProjeto extractData(ResultSet rs) throws SQLException, DataAccessException {
		SituacaoProjeto situacao = new SituacaoProjeto();
		situacao.setSituacaoCodigo(rs.getString("situacao_cod"));
		situacao.setProjetoId(rs.getLong("projeto_id"));
		return situacao;
	}

}
