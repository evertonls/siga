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
		endereco.setBairro(rs.getObject(1));
		endereco.setDivisao(rs.getString(2));
		endereco.setLongradouro(rs.getObject(3));
		endereco.setProjeto(rs.getObject(4));
		endereco.setRegional(rs.getString(5));
		return endereco;
	}

}
