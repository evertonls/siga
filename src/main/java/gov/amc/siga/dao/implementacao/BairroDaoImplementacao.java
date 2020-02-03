package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.BairroDao;
import gov.amc.siga.dao.mapper.BairroMapper;
import gov.amc.siga.model.Bairro;

@Repository
public class BairroDaoImplementacao implements BairroDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public void setDataSource(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarBairro(Bairro bairro) {
		final String query = "INSERT INTO siga.bairro ( bairro ) VALUES( ? );";
		Object[] args = new Object[] { bairro.getBairro().toUpperCase() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Bairro salvo!");
		} else {
			log.info("Falha ao salvar o bairro!");
		}
	}

	@Override
	public void atualizarBairro(Bairro bairro) {
		final String query = "UPDATE siga.bairro SET bairro=? WHERE bairro_id= ?";
		Object[] args = new Object[] { bairro.getBairro().toUpperCase(), bairro.getBairroId() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Bairro atualizado!");
		} else {
			log.info("Falha ao atualizar bairro!");
		}
	}

	@Override
	public void deletarBairro(Bairro bairro) {
		final String query = "DELETE FROM siga.bairro WHERE bairro_id= ?";
		Object[] args = new Object[] { bairro.getBairroId() };
		int out = template.update(query, args);
		if (out != 0) {
			log.info("Bairro deletado!!");
		} else {
			log.info("Falha ao deletar bairro!");
		}
	}

	@Override
	public List<Bairro> listarTodosBairros() {
		final String query = "SELECT bairro_id, bairro FROM siga.bairro";
		return template.query(query, new BairroMapper());
	}

}
