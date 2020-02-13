package gov.amc.siga.configuracao;

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

	@Bean(value = "sigadb")
	DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("org.postgresql.Driver");
//		dataSource.setUrl("jdbc:postgresql://localhost/sigadb");
		dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
		dataSource.setUsername("siga_user");
		dataSource.setPassword("123456789");

		return dataSource;
	}

	@Bean
	public PlatformTransactionManager txSigaManager() {
		return new DataSourceTransactionManager(dataSource());
	}
}