package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.dao.interfaces.IntervencaoTipoDao;
import gov.amc.siga.model.IntervencaoTipo;

public class IntervencaoTipoDaoImplementacao implements IntervencaoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());
	private static final String QUERY = "";
	
	public IntervencaoTipoDaoImplementacao() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void salvarIntervencaoTipo(IntervencaoTipo intervencaoTipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarCodigoIntervencaoTipo(IntervencaoTipo intervencaoTipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarDescricaoIntervencaoTipo(IntervencaoTipo intervencaoTipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletarIntervencaoTipo(IntervencaoTipo intervencaoTipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<IntervencaoTipo> listarTodasIntervencoes() {
		// TODO Auto-generated method stub
		return null;
	}

}
