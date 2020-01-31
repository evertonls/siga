package gov.amc.siga.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.model.OrdemServico;

public interface OrdemServicoDao {

	void setDataSource(DataSource dataSource);
	
	void salvarOrdemServico(OrdemServico ordemServico);
	
	void atualizarOrdemServico(OrdemServico ordemServico);
	
	void deletarOrdemServico(OrdemServico ordemServico);
	
	List<OrdemServico> listarTodasOrdensServico();
}
