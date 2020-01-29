package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.BairroDaoImplementacao;
import gov.amc.siga.model.Bairro;

public class BairroTeste{

	public static void main(String[] args) {

		// final String URL = "jdbc:postgresql://localhost/sigadb";
		final String URL = "jdbc:postgresql://pmfamcs34/sigadb";
		final String USER = "siga_user";
		final String DRIVER = "org.postgresql.Driver";
		final String PASSWORD = "123456789";

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		dataSource.setUsername(USER);
		dataSource.setPassword(PASSWORD);

		BairroDaoImplementacao bairro = new BairroDaoImplementacao();

		bairro.setDataSource(dataSource);
		
//		bairro.salvarBairro("Teste");
		
//		bairro.atualizarBairro(119L, "TESTANDO ATUALIZACAO");
		
		bairro.deletarBairro(119L);
		
		List<Bairro> list = bairro.listarTodosBairros();
		
		for (Bairro bairro2 : list) {
			System.out.println(bairro2.toString());
		}

	}

}
