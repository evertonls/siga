package gov.amc.siga.teste;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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


		
	}
}
