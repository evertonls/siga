package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.AparelhoTipoDao;
import gov.amc.siga.dao.mapper.AparelhoTipoMapper;
import gov.amc.siga.model.AparelhoTipo;

@Repository
public class AparelhoTipoDaoImplementacao implements AparelhoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private final String sqlListarTodos = "SELECT aparelho_cod, aparelho_desc FROM siga.aparelho_tipo";
	private final String sqlDeletarAparelho = "DELETE FROM siga.aparelho_tipo WHERE aparelho_cod = ?";
	private final String sqlAtualizarAparelho = "UPDATE siga.aparelho_tipo SET aparelho_desc = ? WHERE aparelho_cod = ?";
	private final String sqlSalvarAparelho = "INSERT INTO siga.aparelho_tipo (aparelho_cod, aparelho_desc) VALUES (?, ?) ON CONFLICT (aparelho_cod) DO NOTHING";
	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void salvarAparelhoTipo(String aparelhoCodigo, String aparelhoDescricao) {
		JdbcTemplate salvar = new JdbcTemplate(dataSource);
		salvar.update(sqlSalvarAparelho, new Object[] { aparelhoCodigo, aparelhoDescricao });
	}

	@Override
	public void atualizarAparelhoTipo(String aparelhoCodigo, String aparelhoDescricao) {
		JdbcTemplate atualizar = new JdbcTemplate(dataSource);
		atualizar.update(sqlAtualizarAparelho, new Object[] { aparelhoDescricao, aparelhoCodigo });
	}

	@Override
	public void deletarAparelhoTipo(String aparelhoCodigo) {
		JdbcTemplate deletar = new JdbcTemplate(dataSource);
		deletar.update(sqlDeletarAparelho, new Object[] { aparelhoCodigo });
	}

	@Override
	public List<AparelhoTipo> listarTodosAparelhosTipo() {
		JdbcTemplate listar = new JdbcTemplate(dataSource);
		return listar.query(sqlListarTodos, new AparelhoTipoMapper());
	}

}
