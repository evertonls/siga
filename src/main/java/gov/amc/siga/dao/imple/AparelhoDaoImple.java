package gov.amc.siga.dao.imple;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.AparelhoDao;
import gov.amc.siga.dao.mapper.AparelhoMapper;
import gov.amc.siga.model.Aparelho;

@Repository
public class AparelhoDaoImple implements AparelhoDao {

	private final String sqlSalvarAparelho = "INSERT INTO siga.aparelhamentos (aparelho_cod, projeto_id, quantidade) VALUES (?, ?, ?)";
	private final String sqlDeletarAparelhamento = "DELETE FROM siga.aparelhamentos WHERE projeto_id = ? AND aparelho_cod = ?";
	private final String sqlAtualizarAparelho = "UPDATE siga.aparelhamentos SET quantidade = ? WHERE aparelho_cod = ?";
	private final String sqlListarTodosAparelhos = "SELECT aparelho_cod, projeto_id, quantidade FROM siga.aparelhamentos";
	private final String sqlListarTodosAparelhosPorProjetoId = "SELECT aparelho_cod, projeto_id, quantidade FROM siga.aparelhamentos WHERE projeto_id = ?";

	@Autowired
	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public void salvarAparelho(String aparelhoCodigo, Long projeto_id, Double quantidade) {
		JdbcTemplate salvar = new JdbcTemplate(dataSource);
		salvar.update(sqlSalvarAparelho, new Object[] { aparelhoCodigo, projeto_id, quantidade });
	}

	@Override
	public void deletarAparelho(Long projetoId, String aparelhoCodigo) {
		JdbcTemplate deletar = new JdbcTemplate(dataSource);
		deletar.update(sqlDeletarAparelhamento, new Object[] { projetoId, aparelhoCodigo });
	}

	@Override
	public void atualizarAparelho(String aparelhoCodigo, Double quantidade) {
		JdbcTemplate atualizar = new JdbcTemplate(dataSource);
		atualizar.update(sqlAtualizarAparelho, new Object[] { quantidade, aparelhoCodigo });
	}

	@Override
	public List<Aparelho> listarTodosAparelhos() {
		JdbcTemplate listar = new JdbcTemplate(dataSource);
		return listar.query(sqlListarTodosAparelhos, new AparelhoMapper());
	}

	@Override
	public List<Aparelho> listarTodosAparelhosPorProjetoId(Long projetoId) {
		JdbcTemplate listar = new JdbcTemplate(dataSource);
		return listar.query(sqlListarTodosAparelhosPorProjetoId, new Object[] { projetoId }, new AparelhoMapper());
	}

}
