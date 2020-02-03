package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.AparelhoProjetoDaoImplementacao;
import gov.amc.siga.model.AparelhoProjeto;

public class AparelhoProjetoTeste {

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
		
		AparelhoProjetoDaoImplementacao aparelhamento = new AparelhoProjetoDaoImplementacao();
		AparelhoProjeto aparelho = new AparelhoProjeto();
		
		aparelho.setAparelhamentoCodigo("SH-MAN");
		aparelho.setQuantidade(10.0);
		aparelho.setProjetoId(1L);
		aparelho.setAparelhamentoId(3L);
		
		aparelhamento.setDataSource(dataSource);
		
//		aparelhamento.salvarAparelhoProjeto(aparelho);
//		aparelhamento.atualizarAparelhoProjeto(aparelho);
		aparelhamento.deletarAparelhoProjeto(aparelho);
		
		List<AparelhoProjeto> listaAparelho = aparelhamento.listarTodosAparelhos();
		
		for (AparelhoProjeto aparelhamento2 : listaAparelho) {
			System.out.println(aparelhamento2.toString());
		}

	}

}
