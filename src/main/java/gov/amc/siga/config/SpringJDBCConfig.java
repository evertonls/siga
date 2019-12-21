package gov.amc.siga.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("gov.amc.siga.config")
public class SpringJDBCConfig {	
	
//	@Bean(value = "sigadb")
//	public DataSource postgresqlDataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		/* configuração do banco de homologação */
//
//		dataSource.setDriverClassName("org.postgresql.Driver");
//		dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
//		dataSource.setUsername("siga_user");
//		dataSource.setPassword("123456789");
//
//		return dataSource;
//	}
	
	@Bean(value = "sigadb")
	public DataSource postgresqlDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		/* configuração do banco de homologação */

		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost/sigadb");
		dataSource.setUsername("siga_user");
		dataSource.setPassword("123456789");

		return dataSource;
	}
	 

	@Bean
	public PlatformTransactionManager txSigeconManager() {
		return new DataSourceTransactionManager(postgresqlDataSource());
	} 

}
