package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.DescricaoProjeto;

public class DescricaoProjetoResultSetExtractor implements ResultSetExtractor<DescricaoProjeto>{

	@Override
	public DescricaoProjeto extractData(ResultSet rs) throws SQLException, DataAccessException {
		DescricaoProjeto descricoes = new DescricaoProjeto();
		descricoes.setDescricoesId(rs.getLong("descricoes_id"));
		descricoes.setProjetoId(rs.getLong("projeto_id"));
		descricoes.setDescricaoCodigo(rs.getString("descricao_cod"));
		return descricoes;
	}

}
