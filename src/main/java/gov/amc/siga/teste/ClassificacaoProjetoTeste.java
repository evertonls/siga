package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.ClassificacaoProjetoDaoImplementacao;
import gov.amc.siga.model.ClassificacaoProjeto;

public class ClassificacaoProjetoTeste {
	
	public static void main(String[] args) {

	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	
	dataSource.setDriverClassName("org.postgresql.Driver");
//	dataSource.setUrl("jdbc:postgresql://localhost/sigadb");
	dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
	dataSource.setUsername("siga_user");
	dataSource.setPassword("123456789");

	ClassificacaoProjetoDaoImplementacao classificacao = new ClassificacaoProjetoDaoImplementacao();
	ClassificacaoProjeto classificacaoProjeto = new ClassificacaoProjeto();
	
	classificacao.setDataSource(dataSource);
	
	classificacaoProjeto.setClassificacaoCodigo("CICLOFAIXA");
	classificacaoProjeto.setProjetoId(1L);
	
//	classificacao.salvarClassificacaoProjeto(classificacaoProjeto);
//	classificacao.atualizarClassificacaoProjeto(classificacaoProjeto);
	classificacao.deletarClassificacaoProjeto(classificacaoProjeto);
	
	List<ClassificacaoProjeto> list = classificacao.listarTodasClassificacoes();
	
	for (ClassificacaoProjeto classificacoes : list) {
		System.out.println(classificacoes.toString());
	}
	
	}
}
