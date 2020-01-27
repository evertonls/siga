package gov.amc.siga.dao.imple;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.dao.mapper.BairroMapper;
import gov.amc.siga.model.Bairro;

public class BairroDaoImple {

	private String sqlSalvarBairro = "INSERT INTO siga.bairros (bairro_id, bairro) VALUES( ?, ? );";
	private String sqlAtualizarBairro = "UPDATE siga.bairros SET bairro='' WHERE bairro_id= ?";
	private String sqlDeletarBairro = "DELETE FROM siga.bairros WHERE bairro_id= ?";
	private String sqlListarTodosBairros = "SELECT bairro_id, bairro FROM siga.bairros";
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int salvar(Bairro bairro) {
		String sql = "INSERT INTO siga.bairros (bairro_id, bairro) VALUES(" + bairro.getBairroId() + "," + bairro.getBairro()+")";
		return template.update(sql);
	}
	
	
	public List<Bairro> listarTodosBairros(){
		return template.query(sqlListarTodosBairros, new BairroMapper());
	}
	
	
}
