package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.ClassificacaoTipo;

public class CLassificacaoTipoResultSetExtractor implements ResultSetExtractor<ClassificacaoTipo> {

	@Override
	public ClassificacaoTipo extractData(ResultSet rs) throws SQLException, DataAccessException {
		ClassificacaoTipo classificacaoTipo = new ClassificacaoTipo();
		classificacaoTipo.setClassificacaoCodigo(rs.getString("classificacao_cod"));
		classificacaoTipo.setClassificacaoDescricao(rs.getString("classificacao_desc"));
		return classificacaoTipo;
	}

}
