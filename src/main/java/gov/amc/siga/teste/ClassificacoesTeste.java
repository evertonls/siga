package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.ClassificacoesDaoImplementacao;
import gov.amc.siga.model.Classificacoes;

public class ClassificacoesTeste {
	
	public static void main(String[] args) {
		
	
	final String URL = "jdbc:postgresql://pmfamcs34/sigadb";
	final String USER = "siga_user";
	final String DRIVER = "org.postgresql.Driver";
	final String PASSWORD = "123456789";

	DriverManagerDataSource dataSource = new DriverManagerDataSource();

	dataSource.setDriverClassName(DRIVER);
	dataSource.setUrl(URL);
	dataSource.setUsername(USER);
	dataSource.setPassword(PASSWORD);

	ClassificacoesDaoImplementacao classificacao = new ClassificacoesDaoImplementacao();
	
	classificacao.setDataSource(dataSource);
	
//	classificacao.salvarClassificacao("CORREDOR", 1L);
//	classificacao.atualizarClassificacao("ÁREA", 1L);
	classificacao.deletarClassificacao("ÁREA", 1L);
	classificacao.deletarClassificacao("CORREDOR", 1L);
	
	List<Classificacoes> list = classificacao.listarTodasClassificacoes();
	
	for (Classificacoes classificacoes : list) {
		System.out.println(classificacoes.toString());
	}
	
	}
}
