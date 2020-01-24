package gov.amc.siga.dao.imple;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.AparelhamentoDao;
import gov.amc.siga.model.Aparelho;

@Repository
public class AparelhamentoDaoImple implements AparelhamentoDao {

	private final String sqlSalvarAparelho = "INSERT INTO siga.aparelho_tipo (aparelho_cod, aparelho_desc) VALUES (?, ?) ON CONFLICT (aparelho_cod) DO NOTHING";
	private final String sqlDeletarAparelhamento = "DELETE FROM siga.aparelho_tipo WHERE aparelho_cod = ?";
	private final String sqlAtualizarAparelho = "UPDATE siga.aparelho_tipo SET aparelho_desc = ? WHERE aparelho_cod = ?";
	private final String sqlListarTodos = "SELECT aparelho_cod, aparelho_desc FROM siga.aparelho_tipo";

	
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub

	}

	@Override
	public void salvar(String aparelhoCodigo, Long projeto_id, Double quantidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(Long projeto_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(String aparelhoCodigo, Double quantidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Aparelho> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
