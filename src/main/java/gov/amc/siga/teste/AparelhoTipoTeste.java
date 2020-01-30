package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.AparelhoTipoDaoImplementacao;
import gov.amc.siga.model.AparelhoTipo;

public class AparelhoTipoTeste {

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
		
		AparelhoTipoDaoImplementacao aparelhoTipo = new AparelhoTipoDaoImplementacao();
		
		aparelhoTipo.setDataSource(dataSource);
		
		//aparelhoTipo.salvarAparelhoTipo("TESTE", "Tentativa de teste");
		
		//aparelhoTipo.atualizarAparelhoTipo("TESTE", "segunda tentativa de teste");
		
		//aparelhoTipo.deletarAparelhoTipo("TESTE"); 
		
		List<AparelhoTipo> lista = aparelhoTipo.listarTodosAparelhosTipo();
		
		for (AparelhoTipo aparelhoTipo2 : lista) {
			System.out.println(aparelhoTipo2.toString());
		}

	}

}
