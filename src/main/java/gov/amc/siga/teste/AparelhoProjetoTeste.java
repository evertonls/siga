package gov.amc.siga.teste;

import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import gov.amc.siga.dao.implementacao.AparelhoProjetoDaoImplementacao;
import gov.amc.siga.model.AparelhoProjeto;

public class AparelhoProjetoTeste {

	public static void main(String[] args) {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://pmfamcs34/sigadb");
		//dataSource.setUrl("jdbc:postgresql://localhost/sigadb");
		dataSource.setUsername("siga_user");
		dataSource.setPassword("123456789");
		
		AparelhoProjetoDaoImplementacao aparelhamento = new AparelhoProjetoDaoImplementacao();
		AparelhoProjeto aparelho = new AparelhoProjeto();
		
		aparelho.setAparelhamentoCodigo("SV");
		aparelho.setQuantidade(15.0);
		aparelho.setProjetoId(1L);
		aparelho.setAparelhamentoId(2L);
//		aparelho.setAparelhamentoCodigo("SH-MEC");
		
		aparelhamento.setDataSource(dataSource);
		
//		aparelhamento.salvarAparelhoProjeto(aparelho);
		aparelhamento.atualizarAparelhoProjeto(aparelho);
//		aparelhamento.deletarAparelhoProjeto(aparelho);
		
		List<AparelhoProjeto> listaAparelho = aparelhamento.listarTodosAparelhos();
		
		for (AparelhoProjeto aparelhamento2 : listaAparelho) {
			System.out.println(aparelhamento2.toString());
		}

	}

}
