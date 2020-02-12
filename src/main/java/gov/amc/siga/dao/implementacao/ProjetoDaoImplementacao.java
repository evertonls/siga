package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.dao.interfaces.ProjetoDao;
import gov.amc.siga.model.Projeto;

public class ProjetoDaoImplementacao implements ProjetoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	private static final String QUERY = "SELECT " + 
			"	projeto_id, numero, prancha, revisao, contrato, data_cria_proj, observacao," + 
			"	proj_obra, prioridade, data_prevista, data_equipe, data_inicial, is_recape, ci_recape," + 
			"	local_recape, is_execu_rec, data_exe_rec, equipe_cod, medicao, numero_ordem_servico, observacao_vistoria, Obs_OS," + 
			"	classificacao_cod, descricao_cod, situacao_cod, motivo_cod, aparelho_cod, apar_qtd, intervencao_cod, inter_qtd," + 
			"	tipo_cod, bairro, longradouro, jurisdicao, tipo, titulo, cruzamento, cruz_juris, cruz_tipo, cuz_titulo, " + 
			"	trecho,trech_jursi, trech_tipo, trech_titulo, regional, divisao, usuario_nm" + 
			"FROM projeto p";

	public ProjetoDaoImplementacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarProjeto(Projeto projeto) {
		log.info("Salvando projeto..  ID: " + projeto.getProjetoId());
		final String sql = "INSERT INTO siga.projeto (numero, prancha, revisao, contrato, data_cria_proj, observacao, "
				+ "proj_obra, prioridade, data_prevista, data_equipe, data_inicial, is_recape, ci_recape, local_recape, "
				+ "is_execu_rec, data_exe_rec, equipe_cod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		template.update(sql, projeto.getNumeroProjeto(), projeto.getPrancha(), projeto.getRevisao(),
				projeto.getContrato(), projeto.getDataCriacaoProjeto(), projeto.getObsevacao(),
				projeto.getProjetoObra(), projeto.getPrioridade(), projeto.getDataPrevista(), projeto.getDataEquipe(),
				projeto.getDataInicial(), projeto.getIsRecape(), projeto.getCiRecape(), projeto.getLocalRecape(),
				projeto.getIsRecapeExecutado(), projeto.getDataExecucaoRecape());
	}

	@Override
	public void atualizarProjeto(Projeto projeto) {
		log.info("Atualizando projeto.. ID: " + projeto.getProjetoId());
		final String sql = "UPDATE siga.projeto SET numero=?, prancha=?, revisao=?, contrato=?, data_cria_proj=?, observacao=?, "
				+ "proj_obra=?, prioridade=?, data_prevista=?, data_equipe=?, data_inicial=?, is_recape=?, ci_recape=?,"
				+ "local_recape=?, is_execu_rec=?, data_exe_rec=? WHERE projeto_id=?";
		template.update(sql, projeto.getNumeroProjeto(), projeto.getPrancha(), projeto.getRevisao(),
				projeto.getContrato(), projeto.getDataCriacaoProjeto(), projeto.getObsevacao(),
				projeto.getProjetoObra(), projeto.getPrioridade(), projeto.getDataPrevista(), projeto.getDataEquipe(),
				projeto.getDataInicial(), projeto.getIsRecape(), projeto.getCiRecape(), projeto.getLocalRecape(),
				projeto.getIsRecapeExecutado(), projeto.getDataExecucaoRecape(), projeto.getProjetoId());
	}

	@Override
	public void deletarProejto(Projeto projeto) {
		log.info("Deletando projeto.. ID: " + projeto.getProjetoId());
		final String sql = "DELETE FROM siga.projeto WHERE numero=?";
		template.update(sql, projeto.getProjetoId());
	}

	@Override
	public List<Projeto> listarTodosProjetos() {
		return template.query(QUERY, this::projetoRowMap);
	}

	private Projeto projetoRowMap(ResultSet rs, int numRow) throws SQLException {
		return new Projeto(rs.getLong("projeto_id"), rs.getInt("numero"), rs.getString("prancha"),
				rs.getString("revisao"), rs.getString("contrato"), rs.getDate("data_cria_proj").toLocalDate(),
				rs.getString("observacao"), rs.getString("proj_obra"), rs.getString("prioridade"),
				rs.getDate("data_prevista").toLocalDate(), rs.getDate("data_equipe").toLocalDate(),
				rs.getDate("data_inicial").toLocalDate(), rs.getBoolean("is_recape"), rs.getString("ci_recape"),
				rs.getString("local_recape"), rs.getBoolean("is_execu_rec"), rs.getDate("data_exec_rec").toLocalDate());
	}
}
