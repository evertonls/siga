package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.ClassificacaoTipoDaoImplemetacao;
import gov.amc.siga.model.ClassificacaoTipo;

public class ClassificacaoTipoTeste {

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
		
		ClassificacaoTipoDaoImplemetacao classificacao = new ClassificacaoTipoDaoImplemetacao();
		
		classificacao.setDataSource(dataSource);
		
		//classificacao.salvarClassificacaoTipo("TESTE", "TESTANDO");
		//classificacao.atualizarClassificacaoTipo("TESTE", "ATUALIZANDO");
		//classificacao.deletarClassificacaoTipo("TESTE");
		
		List<ClassificacaoTipo> listar = classificacao.listarTodasClassificacaoTipo();
		
		for (ClassificacaoTipo classificacaoTipo : listar) {
			System.out.println(classificacaoTipo.toString());
		}

	}

}
