package gov.amc.siga.dao.extrator;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.OrdemServico;

public class OrdemServicoResultSetExtractor implements ResultSetExtractor<OrdemServico>{

	@Override
	public OrdemServico extractData(ResultSet rs) throws SQLException, DataAccessException {
		OrdemServico ordemServico = new OrdemServico();
		ordemServico.setOrdemServicoId(rs.getLong("ordem_servico_id"));
		ordemServico.setMedicao(rs.getString("medicao"));
		ordemServico.setProjetoId(rs.getLong("projeto_id"));
		ordemServico.setObservacaoVistoria(rs.getString("observacao_vistoria"));
		ordemServico.setObservacao(rs.getString("observacao"));
		return ordemServico;
	}

}
