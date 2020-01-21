package gov.amc.siga.daos.templates;

import java.util.Calendar;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.daos.interfaces.ProjetoDAO;
import gov.amc.siga.models.Projeto;

@Repository
public class ProjetoJDBCTemplate implements ProjetoDAO {

	private final String sqlSalvar = "INSERT INTO projetos (numero, prancha, revisao, contrato, data_cria_proj, observacao, proj_obra,"
			+ "prioridade, data_prevista, data_equipe, data_inicial, is_recape, ci_recape, local_recape, is_execu_rec, data_exe_rec)"
			+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private final String sqlDeletar = "";
	private final String sqlAtualizar = "";
	private final String sqlListar = "SELECT projeto_id, numero, prancha, revisao, contrato, data_cria_proj, "
			+ "observacao, proj_obra, prioridade, data_prevista, data_equipe, data_inicial, is_recape, ci_recape,"
			+ "local_recape, is_execu_rec, data_exe_rec FROM projetos";

	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	}
	
	@Override
	public void salvar(int numeroProjeto, String prancha, String revisao, String contrato, Calendar dataCriacaoProjeto,
			String obsevacao, String projetoObra, String prioridade, Calendar dataPrevista, Calendar dataEquipe,
			Calendar dataInicial, Boolean isRecape, String ciRecape, String localRecape, Boolean isRecapeExecutado,
			Calendar dataExecucaoRecape) {
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		insert.update(sqlSalvar, new Object[] { numeroProjeto, prancha, revisao, contrato, dataCriacaoProjeto,
				obsevacao, projetoObra,	prioridade, dataPrevista, dataEquipe, dataInicial, isRecape, ciRecape,
				localRecape, isRecapeExecutado, dataExecucaoRecape });
		
	}	
	
	@Override
	public void deletar(long projetoId, int numeroProjeto) {

	}

	@Override
	public void atualizar(long projetoId, int numeroProjeto) {

	}

	@Override
	public List<Projeto> listarPorNumero(int numeroProjeto) {
		return null;
	}

	@Override
	public List<Projeto> listarTodosProjetos() {
		return null;
	}




}
