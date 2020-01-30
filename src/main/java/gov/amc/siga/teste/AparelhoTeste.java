package gov.amc.siga.teste;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.AparelhamentoDaoImplementacao;
import gov.amc.siga.model.Aparelhamento;

@SpringBootApplication
public class AparelhoTeste {

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
		
		AparelhamentoDaoImplementacao aparelho = new AparelhamentoDaoImplementacao();
		
		
		//aparelho.salvarAparelhamento("SH-MEC", 1L, 5.0);
		
		//aparelho.salvarAparelhamento("PLACA", 1L, 15.0);
		
		//aparelho.deletarAparelhamentoEspecifico("SH-MEC", 1L, 5.0);
		
		//aparelho.deletarAparelhamento(1L, "PLACA");
		
		//aparelho.atualizarAparelhamento("SH-MEC", 20.0);
		
		//aparelho.deletarAparelhamento(1L, "SH-MEC");
		
		List<Aparelhamento> listaAparelho = aparelho.listarTodosAparelhos();
		
		for (Aparelhamento aparelho2 : listaAparelho) {
			System.out.println(aparelho2.toString());
		}

	}

}
