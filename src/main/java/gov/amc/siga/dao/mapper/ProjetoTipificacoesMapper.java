package gov.amc.siga.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import gov.amc.siga.dao.extrator.ProjetoTipificacoesResultSetExtractor;
import gov.amc.siga.model.ProjetoTipificacoes;

public class ProjetoTipificacoesMapper implements RowMapper<ProjetoTipificacoes>{

	@Override
	public ProjetoTipificacoes mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProjetoTipificacoesResultSetExtractor extractor = new ProjetoTipificacoesResultSetExtractor();
		return extractor.extractData(rs);
	}

}
