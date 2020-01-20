package gov.amc.siga.teste;

import java.util.List;

import gov.amc.siga.daos.templates.AparelhamentosJDBCTemplate;
import gov.amc.siga.models.Aparelhamentos;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.daos.templates.AparelhoJDBCTemplate;
import gov.amc.siga.models.AparelhoTipo;

//@SpringBootApplication
public final class Main {
	private Main() {};
	
	public static void main(String[] args) {
		
		AparelhoJDBCTemplate aparelho = new AparelhoJDBCTemplate();
		AparelhamentosJDBCTemplate aparelhamento = new AparelhamentosJDBCTemplate();

		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
		dataSource.setUsername("siga_user");
		dataSource.setPassword("123456789");
		
		aparelhamento.setDataSource(dataSource);

		aparelhamento.salvar(1, "SH-MEC", 2);
		
		List<Aparelhamentos> list = aparelhamento.listarAparelhamentos();
		
		for (Aparelhamentos aparelhamentos : list) {
			System.out.println();
		}
		
	
		
	}

}
