package gov.amc.siga.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.AparelhoDao;
import gov.amc.siga.model.Aparelho;
import gov.amc.siga.rowmapper.AparelhoRowMapper;

@Repository
public class AparelhoRepository implements AparelhoDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	

	@Override
	public int salvarAparelho(Aparelho aparelho) {
		return jdbcTemplate.update(
				"INSERT INTO siga.aparelho_tipo (aparelho_cod, aparelho_desc) VALUES (?, ?)",
				aparelho.getAparelho_cod(), aparelho.getAparelho_desc());
	}

	@Override
	public int atualizarAparelho(Aparelho aparelho) {
		return jdbcTemplate.update("UPDATE siga.aparelho_tipo SET aparelho_desc = ? WHERE aparelho_cod = ?",
				new Object[] { aparelho.getAparelho_cod(), aparelho.getAparelho_desc() });
	}

	@Override
	public int excluirAparelho(Aparelho aparelho) {
		return jdbcTemplate.update("DELETE FROM siga.aparelho_tipo WHERE aparelho_cod = ?",
				new Object[] { aparelho.getAparelho_cod() });
	}

	@Override
	public Aparelho procurarPorCodigo(String codigo) {
		
		String sql = "SELECT * FROM APARELHO_TIPO WHERE APARELHO_COD = ?";
		
		return jdbcTemplate.queryForObject(sql, new Object[]{codigo}, new AparelhoRowMapper());
	}
	
	@Override
	public List<Aparelho> procurarTodos() {
		String sql = "SELECT aparelho_cod, aparelho_desc FROM siga.aparelho_tipo";
		
		List<Aparelho> aparelhos = new ArrayList<>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
	
		for(Map<String, Object> row : rows) {
			Aparelho aparelho = new Aparelho();
			
			aparelho.setAparelho_cod((String)row.get("aparelho_cod"));
			aparelho.setAparelho_desc((String)row.get("aparelho_desc"));
			aparelhos.add(aparelho);
			
		}
		
		return aparelhos;

	}

}