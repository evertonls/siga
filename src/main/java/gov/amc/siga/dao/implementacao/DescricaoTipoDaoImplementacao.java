package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.dao.interfaces.DescricaoTipoDao;
import gov.amc.siga.dao.mapper.DescricaoTipoMapper;
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
		this.dataSource = ds;
	}

	@Override
	public void salvarDescricaoTipo(String descricaoCodigo, String descricaoDescricao) {
		JdbcTemplate salvar = new JdbcTemplate(dataSource);
		salvar.update(sqlSalvarDescricaoTipo, new Object[] { descricaoCodigo, descricaoDescricao });
	}

	@Override
	public void atualizarDescricaoTipo(String descricaoCodigo, String descricaoDescricao) {
		JdbcTemplate atualizar = new JdbcTemplate(dataSource);
		atualizar.update(sqlAtualizarDescricaoTipo, new Object[] { descricaoDescricao, descricaoCodigo});
	}

	@Override
	public void deletarDescricaoTipo(String descricaoCodigo) {
		JdbcTemplate deletar = new JdbcTemplate(dataSource);
		deletar.update(sqlDeletarDescricaoTipo, new Object[] { descricaoCodigo });			
	}

	@Override
	public List<DescricaoTipo> listarTodasDescricoesTipos() {
		JdbcTemplate listar = new JdbcTemplate(dataSource);
		return listar.query(sqlListarTodasDescricoesTipo, new DescricaoTipoMapper());
	}

}
