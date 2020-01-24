package gov.amc.siga.dao.imple;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.AparelhamentoDao;
import gov.amc.siga.dao.mapper.AparelhamentoMapper;
import gov.amc.siga.model.Aparelho;

@Repository
public class AparelhamentoDaoImple implements AparelhamentoDao {

	private final String sqlSalvarAparelho = "INSERT INTO siga.aparelhamento (aparelho_cod, projeto_id) VALUES (?, ?) ON CONFLICT (aparelho_cod) DO NOTHING";
	private final String sqlDeletarAparelhamento = "DELETE FROM siga.aparelhamento WHERE projeto_id = ?";
	private final String sqlAtualizarAparelho = "UPDATE siga.aparelhamento SET aparelho_cod = ? WHERE projeto_id = ?";
	private final String sqlListarTodos = "SELECT aparelho_cod, projeto_id FROM siga.aparelhamento";

//	@Override
//	public void setDataSource(DataSource dataSource) {
//		// TODO Auto-generated method stub
//
//	}
	
	@Autowired
	private JdbcTemplate template;

	@Autowired
	public AparelhamentoDaoImple(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvar(String aparelhoCodigo, Long projeto_id, Double quantidade) {
		template.update(sqlSalvarAparelho, new Object[] {projeto_id, quantidade});
	}

	@Override
	public void deletar(Long projetoId) {
		template.update(sqlDeletarAparelhamento, new Object[] {projetoId});
	}

	@Override
	public void atualizar(String aparelhoCodigo, Double quantidade) {
		template.update(sqlAtualizarAparelho, new Object[] { aparelhoCodigo, quantidade});
	}

	@Override
	public List<Aparelho> listarTodos() {
		return template.query(sqlListarTodos, new AparelhamentoMapper());
	}

}
