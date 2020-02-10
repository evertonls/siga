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

import gov.amc.siga.dao.interfaces.LongradouroDao;
import gov.amc.siga.model.Longradouro;

@Repository
public class LongradouroDaoImplementacao implements LongradouroDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	private static final String QUERY = "SELECT longradouro_id, longradouro, tipo, titulo, jurisdicao FROM siga.longradouro";

	public LongradouroDaoImplementacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarLongradouro(Longradouro longradouro) {
		log.info("");
		final String sql = "INSERT INTO siga.longradouro (longradouro, tipo, titulo, jurisdicao) VALUES(?, ?, ?, ?)";
		template.update(sql, longradouro.getLongradouro(), longradouro.getTipo(), longradouro.getTitulo(),
				longradouro.getJurisdicao());
	}

	@Override
	public void atualizarLongradouro(Longradouro longradouro) {
		log.info("");
		final String sql = " UPDATE siga.longradouro SET longradouro=?, tipo=?, titulo=?, jurisdicao=? WHERE longradouro_id=?";
		template.update(sql, longradouro.getLongradouro(), longradouro.getTipo(), longradouro.getTitulo(),
				longradouro.getJurisdicao(), longradouro.getLongradouroId());
	}

	@Override
	public void deletarLongradouro(Longradouro longradouro) {
		log.info("");
		final String sql = "DELETE FROM siga.longradouro WHERE longradouro_id=?";
		template.update(sql, longradouro.getLongradouroId());
	}

	@Override
	public List<Longradouro> listarTodosLongradouros() {
		return template.query(QUERY, this::longradouroRowMap);
	}

	private Longradouro longradouroRowMap(ResultSet rs, int numRow) throws SQLException {
		return new Longradouro(rs.getLong("longradouro_id"), rs.getString("longradouro"), rs.getString("tipo"),
				rs.getString("titulo"), rs.getString("jurisdicao"));
	}

}
