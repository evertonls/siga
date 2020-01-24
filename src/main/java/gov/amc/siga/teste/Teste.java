package gov.amc.siga.teste;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.imple.AparelhamentoDaoImple;
import gov.amc.siga.dao.imple.AparelhoTipoDaoImple;
import gov.amc.siga.model.Aparelho;
import gov.amc.siga.model.AparelhoTipo;

@SpringBootApplication
public class Teste {

	public static void main(String[] args) {

		//final String URL = "jdbc:postgresql://localhost/sigadb";
		final String URL = "jdbc:postgresql://pmfamcs34/sigadb";
		final String USER = "siga_user";
		final String DRIVER = "org.postgresql.Driver";
		final String PASSWORD = "123456789";

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		dataSource.setUsername(USER);
		dataSource.setPassword(PASSWORD);

		AparelhoTipoDaoImple aparelho = new AparelhoTipoDaoImple();

		aparelho.setDataSource(dataSource);

		
		
		AparelhamentoDaoImple aparelhamento = new AparelhamentoDaoImple(dataSource);
		
		List<Aparelho> listAparelhos = aparelhamento.listarTodos();
		for (Aparelho aparelhos : listAparelhos) {
			System.out.println(aparelho.toString());
			System.out.println();
		}
		
		List<AparelhoTipo> list = aparelho.listarTodos();

		for (AparelhoTipo aparelhoTipo : list) {
			System.out.println(aparelhoTipo.toString());
			System.out.println();
		}
		
		

	}
}
