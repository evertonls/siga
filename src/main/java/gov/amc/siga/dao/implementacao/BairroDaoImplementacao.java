package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.BairroDao;
import gov.amc.siga.model.Bairro;

@Repository
public class BairroDaoImplementacao implements BairroDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	private static final String query = "SELECT bairro_id, bairro FROM siga.bairro";

	public BairroDaoImplementacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarBairro(Bairro bairro) {
		log.info("Salvando bairro... " + bairro.getBairro());
		final String query = "INSERT INTO siga.bairro ( bairro ) VALUES( ? );";
		template.update(query, bairro.getBairro().toUpperCase());
	}

	@Override
	public void atualizarBairro(Bairro bairro) {
		log.info("Atualizando bairro.." + bairro.getBairro());
		final String query = "UPDATE siga.bairro SET bairro=? WHERE bairro_id= ?";
		template.update(query, bairro.getBairro(), bairro.getBairroId());
	}

	@Override
	public void deletarBairro(Bairro bairro) {
		log.info("Deletando bairro..." + bairro.getBairro());
		final String query = "DELETE FROM siga.bairro WHERE bairro_id= ?";
		template.update(query, bairro.getBairroId());
	}

	@Override
	public List<Bairro> listarTodosBairros() {
		return template.query(query, this::bairroMapRow);
	}
	
	private Bairro bairroMapRow(ResultSet rs, int numRow) throws SQLException {
		return new Bairro(rs.getLong("bairro_id") , rs.getString("bairro"));
	}

}
