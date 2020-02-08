package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.dao.interfaces.ProjetoDao;
import gov.amc.siga.model.Projeto;

public class ProjetoDaoImplementacao implements ProjetoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());
	
	public ProjetoDaoImplementacao() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void salvarProjeto(Projeto projeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarProjeto(Projeto projeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletarProejto(Projeto projeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Projeto> listarTodosProjetos() {
		// TODO Auto-generated method stub
		return null;
	}

}
