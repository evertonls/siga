package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.DescricaoTipoDaoImplementacao;
import gov.amc.siga.model.DescricaoTipo;

public class DescricaoTipoteste {

	public static void main(String[] args) {
		final String URL = "jdbc:postgresql://pmfamcs34/sigadb";
		final String USER = "siga_user";
		final String DRIVER = "org.postgresql.Driver";
		final String PASSWORD = "123456789";

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		dataSource.setUsername(USER);
		dataSource.setPassword(PASSWORD);
		
		DescricaoTipoDaoImplementacao descricao = new DescricaoTipoDaoImplementacao();
		
		descricao.setDataSource(dataSource);
		
//		descricao.salvarDescricaoTipo("TESTE", "TESTANDO");
//		descricao.atualizarDescricaoTipo("TESTE", "ATUALIZANDO");
		descricao.deletarDescricaoTipo("TESTE");
		
		List<DescricaoTipo> listar = descricao.listarTodasDescricoesTipos();		
		for (DescricaoTipo descricaoTipo : listar) {
			System.out.println(descricaoTipo.toString());
		}
		
	}

}
