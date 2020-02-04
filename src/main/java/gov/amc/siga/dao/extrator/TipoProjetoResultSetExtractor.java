package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.TipoProjeto;

public class TipoProjetoResultSetExtractor implements ResultSetExtractor<TipoProjeto>{

	@Override
	public TipoProjeto extractData(ResultSet rs) throws SQLException, DataAccessException {
		TipoProjeto projetoTipificacoes = new TipoProjeto();
		projetoTipificacoes.setProjetoId(rs.getLong("projeto_id"));
		projetoTipificacoes.setProjetoTipoCodigo(rs.getString("tipo_cod"));
		return projetoTipificacoes;
	}

}
