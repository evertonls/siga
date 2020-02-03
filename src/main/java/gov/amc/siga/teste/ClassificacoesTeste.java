package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.ClassificacaoProjetoDaoImplementacao;
import gov.amc.siga.model.ClassificacaoProjeto;

public class ClassificacoesTeste {
	
	public static void main(String[] args) {

	DriverManagerDataSource dataSource = new DriverManagerDataSource();

	dataSource.setDriverClassName("org.postgresql.Driver");
	dataSource.setUrl("jdbc:postgresql://localhost/sigadb");
//	dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
	dataSource.setUsername("siga_user");
	dataSource.setPassword("123456789");

	ClassificacaoProjetoDaoImplementacao classificacao = new ClassificacaoProjetoDaoImplementacao();
	
	classificacao.setDataSource(dataSource);
	
	
	
	List<ClassificacaoProjeto> list = classificacao.listarTodasClassificacoes();
	
	for (ClassificacaoProjeto classificacoes : list) {
		System.out.println(classificacoes.toString());
	}
	
	}
}
