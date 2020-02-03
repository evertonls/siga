package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.BairroDaoImplementacao;
import gov.amc.siga.model.Bairro;

public class BairroTeste{

	public static void main(String[] args) {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
		//dataSource.setUrl("jdbc:postgresql://localhost/sigadb");
		dataSource.setUsername("siga_user");
		dataSource.setPassword("123456789");

		BairroDaoImplementacao bairroDao = new BairroDaoImplementacao();
		Bairro bairro = new Bairro();
		
		bairro.setBairro("Teste");
		bairro.setBairroId(119L);
		
		bairroDao.setDataSource(dataSource);
		
//		bairroDao.salvarBairro(bairro);
//		bairroDao.atualizarBairro(bairro);
//		bairroDao.deletarBairro(bairro);
		
		List<Bairro> list = bairroDao.listarTodosBairros();
		
		for (Bairro bairro2 : list) {
			System.out.println(bairro2.toString());
		}

	}

}
