package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.ClassificacaoTipoDao;
import gov.amc.siga.dao.mapper.ClassificacaoTipoMapper;
import gov.amc.siga.model.ClassificacaoTipo;

@Repository
public class ClassificacaoTipoDaoImplemetacao implements ClassificacaoTipoDao, Serializable{

	private static final long serialVersionUID = 1L;
	private final String sqlSalvarClassificacaoTipo = "INSERT INTO siga.classificacao_tipo (classificacao_cod, classificacao_desc) VALUES( ?, ?)";
	private final String sqlAtualziarDescricaoClassificacaoTipo = "UPDATE siga.classificacao_tipo SET classificacao_desc= ? WHERE classificacao_cod= ?";
	private final String sqlDeletarClassificacaoTipo = "DELETE FROM siga.classificacao_tipo WHERE classificacao_cod= ?";
	private final String sqlListarTodasClassificacaoTipo = "SELECT classificacao_cod, classificacao_desc FROM siga.classificacao_tipo";
	private DataSource dataSource;
	
	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public void salvarClassificacaoTipo(String classificacaoCodigo, String classificacaoDescricao) {
		JdbcTemplate salvar =  new JdbcTemplate(dataSource);
		salvar.update(sqlSalvarClassificacaoTipo, new Object[] { classificacaoCodigo, classificacaoDescricao });
	}

	@Override
	public void atualizarClassificacaoTipo(String classificacaoCodigo, String classificacaoDescricao) {
		JdbcTemplate atualizar = new JdbcTemplate(dataSource);
		atualizar.update(sqlAtualziarDescricaoClassificacaoTipo, new Object[] { classificacaoDescricao, classificacaoCodigo });
	}

	@Override
	public void deletarClassificacaoTipo(String classificacaoCodigo) {
		JdbcTemplate deletar = new JdbcTemplate(dataSource);
		deletar.update(sqlDeletarClassificacaoTipo, new Object[] { classificacaoCodigo });
	}

	@Override
	public List<ClassificacaoTipo> listarTodasClassificacaoTipo() {
		JdbcTemplate listar = new JdbcTemplate(dataSource);
		return listar.query(sqlListarTodasClassificacaoTipo, new ClassificacaoTipoMapper());
	}

}
