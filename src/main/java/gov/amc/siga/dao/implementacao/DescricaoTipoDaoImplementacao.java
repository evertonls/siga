package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.dao.interfaces.DescricaoTipoDao;
import gov.amc.siga.model.DescricaoTipo;

public class DescricaoTipoDaoImplementacao implements DescricaoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private final String sqlSalvarDescricaoTipo = "INSERT INTO siga.descricao_tipo (descricao_cod, descricao_desc) VALUES( ? , ? )";
	private final String sqlAtualizarDescricaoTipo = "UPDATE siga.descricao_tipo SET descricao_desc= ? WHERE descricao_cod=?";
	private final String sqlDeletarDescricaoTipo = "DELETE FROM siga.descricao_tipo WHERE descricao_cod=?";
	private final String sqlListarTodasDescricoesTipo = "SELECT descricao_cod, descricao_desc FROM siga.descricao_tipo";
	private DataSource dataSource;
	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void salvarDescricaoTipo(DescricaoTipo descricaoTipo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atualizarDescricaoTipo(DescricaoTipo descricaoTipo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletarDescricaoTipo(DescricaoTipo descricaoTipo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<DescricaoTipo> listarTodasDescricoesTipos() {
		// TODO Auto-generated method stub
		return null;
	}



}
