package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.templates.AparelhoJDBCTemplate;
import gov.amc.siga.models.Aparelho;

//@SpringBootApplication
public final class Main {
	private Main() {};
	
	public static void main(String[] args) {
		
		AparelhoJDBCTemplate dao = new AparelhoJDBCTemplate();
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
		dataSource.setUsername("siga_user");
		dataSource.setPassword("123456789");
		
		dao.setDataSource(dataSource);
		
		List<Aparelho> list = dao.listAparelhos();
		
		for (Aparelho aparelho : list) {
			System.out.println("Codigo: " + aparelho.getAparelho_cod() + ", Descrição: " + aparelho.getAparelho_desc());
		}
		
	
		
	}

}
