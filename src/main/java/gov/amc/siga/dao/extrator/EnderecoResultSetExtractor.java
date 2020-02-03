package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Endereco;

public class EnderecoResultSetExtractor implements ResultSetExtractor<Endereco>{

	@Override
	public Endereco extractData(ResultSet rs) throws SQLException, DataAccessException {
		Endereco endereco = new Endereco();
		endereco.setEnderecoId(rs.getLong("endereco_id"));
		endereco.setLongradouroId(rs.getLong("longradouro_id"));
		endereco.setLongradouroCruzamento(rs.getLong("longr_cruz"));
		endereco.setLongradouroTrecho(rs.getLong("longr_trecho"));
		endereco.setRegional(rs.getString("regional"));
		endereco.setDivisao(rs.getString("divisao"));
		endereco.setBairroId(rs.getLong("bairro_id"));
		endereco.setProjetoId(rs.getLong("projeto_id"));
		return endereco;
	}

}
