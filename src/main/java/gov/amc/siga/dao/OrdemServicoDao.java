package gov.amc.siga.dao;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.OrdemServico;

public interface OrdemServicoDao {

	void setDataSource(DataSource dataSource);
	
	void salvarOrdemServico(Long ordemServicoId, Integer numero, String medicao, Long projetoId, String observacaoVistoria, String observacao);
	
	void atualizarOrdemServico(Long ordemServicoId, Integer numero, String medicao, Long projetoId, String observacaoVistoria, String observacao);
	
	void deletarOrdemServico(Long ordemServicoId);
	
	List<OrdemServico> listarTodasOrdensServico();
	
	OrdemServico listarTodasOrdensServicoPorProjetoId(Long projetoId);
}
