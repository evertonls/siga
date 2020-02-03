package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.dao.interfaces.DescricaoTipoDao;
import gov.amc.siga.dao.mapper.DescricaoTipoMapper;
import gov.amc.siga.model.DescricaoTipo;

public class DescricaoTipoDaoImplementacao implements DescricaoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	private final String salvar = "INSERT INTO siga.descricao_tipo (descricao_cod, descricao_desc) VALUES( ?, ?)";
	private final String atualizar = "UPDATE siga.descricao_tipo SET descricao_cod= ?, descricao_desc=? WHERE descricao_id= ?";
	private final String deletar = "DELETE FROM siga.descricao_tipo WHERE descricao_id=?";
	private final String listar = "SELECT descricao_id, descricao_cod, descricao_desc FROM siga.descricao_tipo";

	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void setDataSource(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarDescricaoTipo(DescricaoTipo descricaoTipo) {
		Object[] args = new Object[] { descricaoTipo.getDescricaoCodigo(), descricaoTipo.getDescricaoDescricao() };
		int out = template.update(salvar, args);
		if(out != 0) {
			log.info("Tipo de descrição salva!");
		}else {
			log.info("Falha ao salvar tipo de descrição");
		}
	}

	@Override
	public void atualizarDescricaoTipo(DescricaoTipo descricaoTipo) {
		Object[] args = new Object[] { descricaoTipo.getDescricaoCodigo(), descricaoTipo.getDescricaoDescricao(), descricaoTipo.getDescricaoId() };
		int out = template.update(atualizar, args);
		if(out != 0) {
			log.info("Tipo de descrição atualizada!");
		}else {
			log.info("Falha ao atualizar tipo de descrição");
		}
	}

	@Override
	public void deletarDescricaoTipo(DescricaoTipo descricaoTipo) {
		Object[] args = new Object[] { descricaoTipo.getDescricaoId() };
		int out = template.update(deletar, args);
		if(out != 0) {
			log.info("Tipo de descrição deletada!");
		}else {
			log.info("Falha ao deletar tipo de descrição");
		}
	}

	@Override
	public List<DescricaoTipo> listarTodasDescricoesTipos() {
		return template.query(listar, new DescricaoTipoMapper());
	}

}
