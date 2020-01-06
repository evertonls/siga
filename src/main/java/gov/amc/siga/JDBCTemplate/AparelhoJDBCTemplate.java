package gov.amc.siga.JDBCTemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.dao.AparelhoDao;
import gov.amc.siga.model.Aparelho;
import gov.amc.siga.rowmapper.AparelhoMapper;

public class AparelhoJDBCTemplate implements AparelhoDao{
	
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource dataSource) {

		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		
	}

	@Override
	public void create(String aparelho_cod, String aparelho_desc) {

		String SQL = "insert into aparelhamentos (aparelho_code, projeto_id, quantidade) values (?, ?, ?)";
		jdbcTemplateObject.update( SQL, aparelho_cod, aparelho_desc );
		System.out.println("Aparelho gravado = " + aparelho_cod + ", Descrição: " + aparelho_desc);
		
	}

	@Override
	public Aparelho getAparelho(String aparelho_cod) {

		String SQL = "select * from aparelho_tipo where projeto.id = ?";
		Aparelho aparelho = jdbcTemplateObject.queryForObject(SQL,  new Object[] {aparelho_cod}, new AparelhoMapper());
		
		return aparelho;
	}

	public List<Aparelho> listarAparelhos() {
		
		String SQL = "SELECT * FROM aparelho_tipo AT";
		List <Aparelho> aparelhos = jdbcTemplateObject.query(SQL, new AparelhoMapper());
		
		return aparelhos;
		
	}

	@Override
	public void delete(String aparelho_cod) {
		
		String SQL = "select * from aparelho_tipo where aparelho_code = ?";
		jdbcTemplateObject.batchUpdate(SQL, aparelho_cod);
		System.out.println("Aparelho deletado! codigo: " + aparelho_cod);
		return;
		
	}

	@Override
	public void update(String aparelho_cod, String aparelho_desc) {

	}

}
