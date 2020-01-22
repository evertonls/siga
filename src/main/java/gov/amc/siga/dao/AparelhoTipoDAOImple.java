package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import gov.amc.siga.mapper.AparelhoMapper;
import gov.amc.siga.model.AparelhoTipo;

@Component
public class AparelhoTipoDAOImple implements AparelhoTipoDao{
	
	JdbcTemplate jdbcTemplate;
	
	private final String sqlBuscarPeloCodigo = "SELECT APARELHO_COD, APARELHO_DESC FROM SIGA.APARELHO_TIPO WHERE APARELHO_COD = ?";
	private final String sqlListarTodos = "SELECT APARELHO_COD, APARELHO_DESC FROM SIGA.APARLEHO_TIPO";
	private final String sqlDeletarAparelho = "";
	private final String sqlAtualizarAparelho = "";
	private final String sqlSalvarAparelho = "";
	
	@Autowired
	public AparelhoTipoDAOImple (DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public AparelhoTipo buscarPeloCodigo(String aparelhoCodigo) {
		return jdbcTemplate.queryForObject(sqlBuscarPeloCodigo, new Object[] {aparelhoCodigo}, new AparelhoMapper());
	}

	@Override
	public List<AparelhoTipo> listarTodos() {
		return jdbcTemplate.query(sqlListarTodos, new AparelhoMapper());
	}

	@Override
	public boolean deletarAparelho(AparelhoTipo aparelhoTipo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean atualizarAparelho(AparelhoTipo aparelhoTipo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean salvarAparelho(AparelhoTipo aparelhoTipo) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
