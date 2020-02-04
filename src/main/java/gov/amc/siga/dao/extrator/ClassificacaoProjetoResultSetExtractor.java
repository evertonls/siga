package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.ClassificacaoProjeto;

public class ClassificacaoProjetoResultSetExtractor implements ResultSetExtractor<ClassificacaoProjeto>{

	@Override
	public ClassificacaoProjeto extractData(ResultSet rs) throws SQLException, DataAccessException {
		ClassificacaoProjeto classificacoes = new ClassificacaoProjeto();
		classificacoes.setProjetoId(rs.getLong("projeto_id"));
		classificacoes.setClassificacaoCodigo(rs.getString("classificacao_cod"));
		return classificacoes;
	}

}
