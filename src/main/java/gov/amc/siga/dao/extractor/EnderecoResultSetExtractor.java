package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Endereco;

public class EnderecoResultSetExtractor implements ResultSetExtractor<Endereco>{

	@Override
	public Endereco extractData(ResultSet rs) throws SQLException, DataAccessException {
		Endereco endereco = new Endereco();
		endereco.setBairroId(rs.getLong("bairro_id"));
		endereco.setDivisao(rs.getString("divisao"));
		endereco.setLongradouroId(rs.getLong("longradouro_id"));
		endereco.setProjetoId(rs.getLong("projeto_id"));
		endereco.setRegional(rs.getString("regional"));
		return endereco;
	}

}
