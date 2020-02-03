package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.AparelhoTipoDaoImplementacao;
import gov.amc.siga.model.AparelhoTipo;

public class AparelhoTipoTeste {

	public static void main(String[] args) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
		//dataSource.setUrl("jdbc:postgresql://localhost/sigadb");
		dataSource.setUsername("siga_user");
		dataSource.setPassword("123456789");
		
		AparelhoTipoDaoImplementacao aparelhoTipo = new AparelhoTipoDaoImplementacao();
		AparelhoTipo aparelho = new AparelhoTipo();
		
		aparelho.setAparelhoCodigo("Teste");
		aparelho.setAparelhoDescricao("Testando");
//		
		aparelhoTipo.setDataSource(dataSource);
//		aparelhoTipo.deletarAparelhoTipo(aparelho);
		aparelhoTipo.salvarAparelhoTipo(aparelho);
		
		List<AparelhoTipo> lista = aparelhoTipo.listarTodosAparelhosTipo();
		
		for (AparelhoTipo aparelhoTipo2 : lista) {
			System.out.println(aparelhoTipo2.toString());
		}

	}

}
