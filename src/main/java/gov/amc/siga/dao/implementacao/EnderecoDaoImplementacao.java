package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.EnderecoDao;
import gov.amc.siga.model.Endereco;

@Repository
public class EnderecoDaoImplementacao implements EnderecoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());

	private static final String QUERY = "SELECT endereco_id, longradouro_id, longr_cruz, longr_trecho, regional, divisao, bairro_id, projeto_id FROM siga.endereco";

	public EnderecoDaoImplementacao(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public void salvarEndereco(Endereco endereco) {
		log.info("Salvando endereço...");
		final String sql = "INSERT INTO siga.endereco (longradouro_id, longr_cruz, longr_trecho, regional, divisao, bairro_id, projeto_id) VALUES(?, ?, ?, ?, ?, ?, ?)";
		template.update(sql, endereco.getBairro().getLongradouro().getLongradouroId(),
				endereco.getBairro().getCruzamento().getLongradouroId(),
				endereco.getBairro().getTrecho().getLongradouroId(), endereco.getRegional(), endereco.getDivisao(),
				endereco.getBairro().getBairroId(), endereco.getProjeto().getProjetoId());
	}

	@Override
	public void atualizarEndereco(Endereco endereco) {
		log.info("Atualizando cruzamento... ");
		final String sql = "UPDATE siga.endereco SET longradouro_id=?, longr_cruz=?, longr_trecho=?, regional=?, divisao=?, bairro_id=?, projeto_id=? WHERE endereco_id=?";
		template.update(sql, endereco.getBairro().getLongradouro().getLongradouroId(),
				endereco.getBairro().getCruzamento().getLongradouroId(),
				endereco.getBairro().getTrecho().getLongradouroId(), endereco.getRegional(), endereco.getDivisao(),
				endereco.getBairro().getBairroId(), endereco.getProjeto().getProjetoId(), endereco.getEnderecoId());
	}

	@Override
	public void deletarEndereco(Endereco endereco) {
		log.info("Deletando endereco... ");
		final String sql = "DELETE FROM siga.endereco WHERE endereco_id=?";
		template.update(sql, endereco.getEnderecoId());
	}

	@Override
	public List<EnderecoDao> listarTodosEnderecos() {
//		return template.query(QUERY, this::enderecoMapRow);
		return null;
	}

//	private Endereco enderecoMapRow(ResultSet rs, int numRow) throws SQLException {
//	
//		
//		return endereco;
//		
//		return new Endereco(rs.getLong("endereco_id"), rs.getLong("Longradouro_id"), rs.getLong("Longr_cruz"),
//				rs.getLong("longr_trech"), rs.getString("regional"), rs.getString("divisao"), rs.getLong("bairro_id"),
//				rs.getLong("projeto_id"));
//	}

}
