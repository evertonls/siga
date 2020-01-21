package gov.amc.siga.teste;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.daos.templates.AparelhamentoJDBCTemplate;
import gov.amc.siga.daos.templates.AparelhoJDBCTemplate;
import gov.amc.siga.daos.templates.ProjetoJDBCTemplate;

//@SpringBootApplication
public final class Main {
	private Main() {};
	
	public static void main(String[] args) {
		
		AparelhoJDBCTemplate aparelho = new AparelhoJDBCTemplate();
		AparelhamentoJDBCTemplate aparelhamento = new AparelhamentoJDBCTemplate();
		ProjetoJDBCTemplate projeto = new ProjetoJDBCTemplate();

		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
		dataSource.setUsername("siga_user");
		dataSource.setPassword("123456789");

		aparelho.setDataSource(dataSource);
		aparelhamento.setDataSource(dataSource);
		projeto.setDataSource(dataSource);

		projeto.salvar(1010, "prancha", "Revisao", "Contrato", 2019-01-21, "Sem Observação", "Pré-Obra", "Alta", 2020-01-21, 2020-01-21, 2020-01-21,
				true, "Recape", "LocalRecape", true, 2020-01-21);
		
	}

}
