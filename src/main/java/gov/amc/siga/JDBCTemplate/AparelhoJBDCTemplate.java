package gov.amc.siga.JDBCTemplate;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.AparelhoDao;
import gov.amc.siga.model.Aparelho;

@Repository
public class AparelhoJBDCTemplate implements AparelhoDao, Serializable {

	private static final long serialVersionUID = 1L;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int salvarAparelho(Aparelho aparelho) {
		return jdbcTemplate.update("INSERT INTO siga.aparelho_tipo (aparelho_cod, aparelho_desc) VALUES (?, ?)",
				aparelho.getAparelho_cod(), aparelho.getAparelho_desc());
	}

	@Override
	public int atualizarAparelho(Aparelho aparelho) {
		return jdbcTemplate.update("UPDATE siga.aparelho_tipo SET aparelho_desc = ? WHERE aparelho_cod = ?",
				aparelho.getAparelho_cod(), aparelho.getAparelho_desc());
	}

	@Override
	public int excluirAparelho(Aparelho aparelho) {
		return jdbcTemplate.update("DELETE FROM siga.aparelho_tipo WHERE aparelho_cod = ?", aparelho.getAparelho_cod());
	}

	@Override
	public List<Aparelho> procurarTodos() {
		return jdbcTemplate.query("SELECT aparelho_cod, aparelho_desc FROM siga.aparelho_tipo",
				(rs, rowNum) -> new Aparelho(rs.getString("aparelho_cod"), rs.getString("aparelho_desc")));
	}
	
}