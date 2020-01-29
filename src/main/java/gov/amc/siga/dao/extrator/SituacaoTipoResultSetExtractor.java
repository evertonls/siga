package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.SituacaoTipo;

public class SituacaoTipoResultSetExtractor implements ResultSetExtractor<SituacaoTipo>{

	@Override
	public SituacaoTipo extractData(ResultSet rs) throws SQLException, DataAccessException {
		SituacaoTipo situacaoTipo = new SituacaoTipo();
		situacaoTipo.setSituacaoCodigo(rs.getString("situacao_cod"));
		situacaoTipo.setSituacaoDescricao(rs.getString("situacao_desc"));
		return situacaoTipo;
	}

}
