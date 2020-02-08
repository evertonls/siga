package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.dao.interfaces.OrdemServicoDao;
import gov.amc.siga.model.OrdemServico;

public class OrdenServicoDaoImplementacao implements OrdemServicoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());
	private static final String QUERY = "";
	
	public OrdenServicoDaoImplementacao() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void salvarOrdemServico(OrdemServico ordemServico) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarOrdemServico(OrdemServico ordemServico) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletarOrdemServico(OrdemServico ordemServico) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<OrdemServico> listarTodasOrdensServico() {
		// TODO Auto-generated method stub
		return null;
	}

}
