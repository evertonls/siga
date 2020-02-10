package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.dao.interfaces.OrdemServicoDao;
import gov.amc.siga.model.OrdemServico;

public class OrdenServicoDaoImplementacao implements OrdemServicoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	private static final String QUERY = "SELECT ordem_servico_id, numero_ordem_servico, medicao, projeto_id, obervacao_vistoria, observavao FROM siga.ordemservico";

	public OrdenServicoDaoImplementacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarOrdemServico(OrdemServico ordemServico) {
		log.info("");
		final String sql = "INSERT INTO siga.ordemservico (numero_ordem_servico, medicao, projeto_id, obervacao_vistoria, observavao) VALUES(?, ?, ?, ?, ?)";
		template.update(sql, ordemServico.getNumeroOrdemServico(), ordemServico.getMedicao(),
				ordemServico.getProjetoId(), ordemServico.getObservacaoVistoria(), ordemServico.getObservacao());
	}

	@Override
	public void atualizarOrdemServico(OrdemServico ordemServico) {
		log.info("");
		final String sql = "UPDATE siga.ordemservico SET ordem_servico_id=?, medicao=?, projeto_id=?, obervacao_vistoria=?, observavao=? WHERE ordem_servico_id=?";
		template.update(sql, ordemServico.getOrdemServicoId(), ordemServico.getMedicao(), ordemServico.getProjetoId(),
				ordemServico.getObservacaoVistoria(), ordemServico.getObservacao(), ordemServico.getOrdemServicoId());
	}

	@Override
	public void deletarOrdemServico(OrdemServico ordemServico) {
		log.info("");
		final String sql = "DELETE FROM siga.ordemservico WHERE ordem_servico_id=?";
		template.update(sql, ordemServico.getOrdemServicoId());
	}

	@Override
	public List<OrdemServico> listarTodasOrdensServico() {
		return template.query(QUERY, this::ordemServicoRowMap);
	}

	private OrdemServico ordemServicoRowMap(ResultSet rs, int numRow) throws SQLException {
		return new OrdemServico(rs.getLong("ordem_servico_id"), rs.getLong("numero_ordem_servico"),
				rs.getString("medicao"), rs.getLong("projeto_id"), rs.getString("observacao_vistoria"),
				rs.getString("observacao"));
	}

}
