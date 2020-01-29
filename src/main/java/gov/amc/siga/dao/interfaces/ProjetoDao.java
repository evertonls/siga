package gov.amc.siga.dao.interfaces;

import java.time.LocalDate;
import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.Projeto;

public interface ProjetoDao {

	void setDataSource(DataSource ds);

	void salvarProjeto(Long projetoId, Integer numeroProjeto, String prancha, String revisao, String contrato,
			String obsevacao, String projetoObra, String prioridade, String ciRecape, Boolean isRecape,
			Boolean isRecapeExecutado, String localRecape, LocalDate dataCriacaoProjeto, LocalDate dataPrevista,
			LocalDate dataEquipe, LocalDate dataInicial, LocalDate dataExecucaoRecape);

	void atualizarProjeto(Long projetoId, Integer numeroProjeto, String prancha, String revisao, String contrato,
			String obsevacao, String projetoObra, String prioridade, String ciRecape, Boolean isRecape,
			Boolean isRecapeExecutado, String localRecape, LocalDate dataCriacaoProjeto, LocalDate dataPrevista,
			LocalDate dataEquipe, LocalDate dataInicial, LocalDate dataExecucaoRecape);
	
	void deletarProejto(Long projetoId);
	
	List<Projeto> listarTodosProjetos();
	
	Projeto listarProjetoPorId(Long projetoId);
}
