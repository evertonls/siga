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
	private final String sqlDeletarAparelhamento = "DELETE FROM siga.aparelhamentos WHERE projeto_id = ?";
	private final String sqlAtualizarAparelho = "UPDATE siga.aparelhamentos SET quantidade = ? WHERE aparelho_cod = ?";
	private final String sqlListarTodos = "SELECT aparelho_cod, projeto_id, quantidade FROM siga.aparelhamentos";


	@Autowired
	private DataSource dataSource;
		
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
		
	@Override
	public void salvar(String aparelhoCodigo, long projeto_id, double quantidade) {
		JdbcTemplate salvar = new JdbcTemplate(dataSource);
		salvar.update(sqlSalvarAparelho, new Object[] {aparelhoCodigo, projeto_id, quantidade});
	}

	@Override
	public void deletar(long projetoId) {
		JdbcTemplate deletar = new JdbcTemplate(dataSource);
		deletar.update(sqlDeletarAparelhamento, new Object[] {projetoId});
	}

	@Override
	public void atualizar(String aparelhoCodigo, double quantidade ) {
		JdbcTemplate atualizar = new JdbcTemplate(dataSource);
		atualizar.update(sqlAtualizarAparelho, new Object[] { quantidade, aparelhoCodigo});
	}

	@Override
	public List<Aparelho> listarTodos() {
		JdbcTemplate listar = new JdbcTemplate(dataSource);
		return listar.query(sqlListarTodos, new AparelhoMapper());
	}



}
