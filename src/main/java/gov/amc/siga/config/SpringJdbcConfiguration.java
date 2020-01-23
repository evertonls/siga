package gov.amc.siga.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@ComponentScan("gov.amc.siga")
public class SpringJdbcConfiguration {

	//private final String URL = "jdbc:postgresql://localhost/sigadb";
	private final String URL= "jdbc:postgresql://pmfamcs34/sigadb";
	private final String USER = "siga_user";
	private final String DRIVER = "org.postgresql.Driver";
	private final String PASSWORD = "123456789";

	@Bean//(value = "sigadb")
	DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		dataSource.setUsername(USER);
		dataSource.setPassword(PASSWORD);

		return dataSource;
	}

	@Bean
	public PlatformTransactionManager txSigaManager() {
		return new DataSourceTransactionManager(dataSource());
	}
}