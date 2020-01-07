package gov.amc.siga.JDBCTemplate;

import java.io.Serializable;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.AparelhoDao;

@Repository
public class AparelhoJBDCTemplate implements AparelhoDao, Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private final String query = "SELECT APARELHO_COD, APARELHO_DESC FROM APARELHO_TIPO";
	
	@Autowired
	public void AparelhoJDBCTemplate( DataSource ds ) {
		this.template = new JdbcTemplate( ds );
	}
	
	
	
}
