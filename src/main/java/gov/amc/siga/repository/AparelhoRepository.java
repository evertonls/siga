package gov.amc.siga.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.AparelhoDao;
import gov.amc.siga.model.Aparelho;

@Repository
public class AparelhoRepository implements AparelhoDao, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int contadorAparelho() {
		return jdbcTemplate.queryForObject("select count(*) from siga.aparelho_tipo", Integer.class);
	}

	@Override
	public int salvarAparelho(Aparelho aparelho) {
		return jdbcTemplate.update("insert into siga.aparelho_tipo (aparelho_cod, aparelho_desc) values(?,?)",
				aparelho.getAparelho_cod(), aparelho.getAparelho_desc());
	}

	@Override
	public int atualizarAparelho(Aparelho aparelho) {
		return jdbcTemplate.update("update siga.aparelho_tipo set aparelho_desc = ? where aparelho_cod = ?",
				aparelho.getAparelho_cod(), aparelho.getAparelho_desc());
	}

	@Override
	public int deletarAparelho(Aparelho aparelho) {
		return jdbcTemplate.update("delete siga.aparelho_tipo where aparelho_cod = ?", aparelho.getAparelho_cod());
	}

	@Override
	public List<Aparelho> procurarTodosAparelhos() {
		return jdbcTemplate.query("select * from siga.aparelho_tipo",
				(rs, rowNum) -> new Aparelho(rs.getString("aparelho_cod"), rs.getString("aparelho_desc")));
	}

	@Override
	public List<Aparelho> procurarPeloCodigo(String aparelho_cod) {
		return jdbcTemplate.query("select * from siga.aparelho_tipo where aparelho_cod like ? and aparelho_desc <= ?",
				new Object[] { "%" + aparelho_cod },
				(rs, rowNum) -> new Aparelho(rs.getString("aparelho_cod"), rs.getString("aparelho_desc")));
	}
}
