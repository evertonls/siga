package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.DescricaoTipoDaoImplementacao;
import gov.amc.siga.model.DescricaoTipo;

public class DescricaoTipoteste {

	public static void main(String[] args) {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("org.postgresql.Driver");
//		dataSource.setUrl("jdbc:postgresql://localhost/sigadb");
		dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
		dataSource.setUsername("siga_user");
		dataSource.setPassword("123456789");
		
		DescricaoTipoDaoImplementacao descricao = new DescricaoTipoDaoImplementacao();
		DescricaoTipo descricaoTipo = new DescricaoTipo();
		
		descricao.setDataSource(dataSource);
		
		descricaoTipo.setDescricaoCodigo("Teste");
		descricaoTipo.setDescricaoDescricao("testando atualizar");

		
//		descricao.salvarDescricaoTipo(descricaoTipo);
//		descricao.atualizarDescricaoTipo(descricaoTipo);
//		descricao.deletarDescricaoTipo(descricaoTipo);
		
		
		List<DescricaoTipo> listar = descricao.listarTodasDescricoesTipos();		
		for (DescricaoTipo descricaoTipo2 : listar) {
			System.out.println(descricaoTipo2.toString());
		}
		
	}

}
