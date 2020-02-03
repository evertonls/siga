package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.BairroDaoImplementacao;
import gov.amc.siga.model.Bairro;

public class BairroTeste{

	public static void main(String[] args) {

		final String URL = "jdbc:postgresql://localhost/sigadb";
		//final String URL = "jdbc:postgresql://pmfamcs34/sigadb";
		final String USER = "siga_user";
		final String DRIVER = "org.postgresql.Driver";
		final String PASSWORD = "123456789";

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		dataSource.setUsername(USER);
		dataSource.setPassword(PASSWORD);

		BairroDaoImplementacao bairroDao = new BairroDaoImplementacao();
		Bairro bairro = new Bairro();
		
		bairro.setBairro("Testando");
		bairro.setBairroId(119L);
		
		bairroDao.setDataSource(dataSource);
		
//		bairroDao.salvarBairro(bairro);
//		bairroDao.atualizarBairro(bairro);
		bairroDao.deletarBairro(bairro);
		
		List<Bairro> list = bairroDao.listarTodosBairros();
		
		for (Bairro bairro2 : list) {
			System.out.println(bairro2.toString());
		}

	}

}
