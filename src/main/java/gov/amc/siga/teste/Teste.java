package gov.amc.siga.teste;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.imple.AparelhoDaoImple;
import gov.amc.siga.dao.imple.AparelhoTipoDaoImple;
import gov.amc.siga.dao.imple.BairroDaoImple;
import gov.amc.siga.model.Bairro;

@SpringBootApplication
public class Teste {

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

		AparelhoDaoImple aparelhamento = new AparelhoDaoImple();
		AparelhoTipoDaoImple aparelho = new AparelhoTipoDaoImple();
		BairroDaoImple bairroImple = new BairroDaoImple();
		Bairro bairro = new Bairro();
		
		aparelho.setDataSource(dataSource);
		aparelhamento.setDataSource(dataSource);

		bairro.setBairro("Teste");
		bairro.setbairroId(200);
		
		bairroImple.salvar(bairro);
		
//		List<Bairro> list = bairroImple.listarTodosBairros();
//		
//		for (Bairro bairro2 : list) {
//			System.out.println(bairro2.toString());
//		}


		
	}
}
