package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.EnderecoDao;
import gov.amc.siga.model.Endereco;

@Repository
public class EnderecoDaoImplementacao implements EnderecoDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	JdbcTemplate template;

	@Override
	public void setDataSurce(DataSource ds) {
		template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarEndereco(Endereco endereco) {
		
	}

	@Override
	public void atualizarEndereco(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarEndereco(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EnderecoDao> listarTodosEnderecos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
