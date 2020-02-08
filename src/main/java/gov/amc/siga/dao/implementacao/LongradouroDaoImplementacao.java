package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.dao.interfaces.LongradouroDao;
import gov.amc.siga.model.Longradouro;

public class LongradouroDaoImplementacao implements LongradouroDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());
	private static final String QUERY = "";
	
	public LongradouroDaoImplementacao() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void salvarLongradouro(Longradouro longradouro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarLongradouro(Longradouro longradouro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletarLongradouro(Longradouro longradouro) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Longradouro> listarTodosLongradouros() {
		// TODO Auto-generated method stub
		return null;
	}

}
