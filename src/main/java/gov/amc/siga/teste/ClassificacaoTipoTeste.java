package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.ClassificacaoTipoDaoImplemetacao;
import gov.amc.siga.model.ClassificacaoTipo;

public class ClassificacaoTipoTeste {

	public static void main(String[] args) {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost/sigadb");
//		dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
		dataSource.setUsername("siga_user");
		dataSource.setPassword("123456789");
		
		ClassificacaoTipo classificacao = new ClassificacaoTipo();
		classificacao.setClassificacaoCodigo("teste");
		classificacao.setClassificacaoDescricao("testando");
		
		ClassificacaoTipoDaoImplemetacao classificacaoTipo = new ClassificacaoTipoDaoImplemetacao();
		
		classificacaoTipo.setDataSource(dataSource);
//		classificacaoTipo.salvarClassificacaoTipo(classificacao);
		classificacaoTipo.deletarClassificacaoTipo(classificacao);
		
		List<ClassificacaoTipo> listar = classificacaoTipo.listarTodasClassificacaoTipo();
		
		for (ClassificacaoTipo classificacaoTipo2 : listar) {
			System.out.println(classificacaoTipo2.toString());
		}

	}

}
