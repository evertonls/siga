package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.AparelhoTipoDao;
import gov.amc.siga.dao.mapper.AparelhoTipoMapper;
import gov.amc.siga.model.AparelhoTipo;

@Repository
public class AparelhoTipoDaoImplementacao implements AparelhoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log= LoggerFactory.getLogger(getClass()); 
	
	@Override
	public void setDataSource(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarAparelhoTipo(AparelhoTipo aparelhoTipo) {

		final String query = "INSERT INTO siga.aparelho_tipo (aparelho_cod, aparelho_desc) VALUES (?, ?) ON CONFLICT (aparelho_cod) DO NOTHING";
		Object[] args = new Object[] { aparelhoTipo.getAparelhoCodigo().toUpperCase(), aparelhoTipo.getAparelhoDescricao().toUpperCase() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Tipo de aparelho salvo!");
		} else {
			log.info("Falha ao salvar tipo de aparelho");
		}
	}
	
	@Override
	public void atualizarAparelhoTipo(AparelhoTipo aparelhoTipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarAparelhoTipo(AparelhoTipo aparelhoTipo) {
		final String query = "DELETE FROM siga.aparelho_tipo WHERE aparelho_cod = ?";
		Object[] args = new Object[] { aparelhoTipo.getAparelhoCodigo() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Tipo de aparelho deletado!");
		} else {
			log.info("Falha ao deletar tipo de aparelho!");
		}
	}

	@Override
	public List<AparelhoTipo> listarTodosAparelhosTipo() {
		final String query = "SELECT aparelho_id, aparelho_cod, aparelho_desc FROM siga.aparelho_tipo";
		return template.query(query, new AparelhoTipoMapper());
	}

}
