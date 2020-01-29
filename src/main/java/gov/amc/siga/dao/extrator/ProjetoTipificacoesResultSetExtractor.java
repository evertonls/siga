package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.ProjetoTipificacoes;

public class ProjetoTipificacoesResultSetExtractor implements ResultSetExtractor<ProjetoTipificacoes>{

	@Override
	public ProjetoTipificacoes extractData(ResultSet rs) throws SQLException, DataAccessException {
		ProjetoTipificacoes projetoTipificacoes = new ProjetoTipificacoes();
		projetoTipificacoes.setProjetoId(rs.getLong("projeto_id"));
		projetoTipificacoes.setProjetoTipoCodigo(rs.getString("tipo_cod"));
		return projetoTipificacoes;
	}

}
