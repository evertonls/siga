package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.dao.interfaces.ProjetoTipoDao;
import gov.amc.siga.model.ProjetoTipo;

public class ProjetoTipoDaoImplementacao implements ProjetoTipoDao, Serializable{

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private Logger log = LoggerFactory.getLogger(getClass());
	private static final String QUERY = "SELECT tipo_cod, tipo_desc FROM siga.projeto_tipo";

	@Override
	public void salvarProjetoTipo(ProjetoTipo projetoTipo) {
		log.info("Salvando tipo de projeto... " + projetoTipo.getProjetoTipoCodigo());
		final String sql = "INSERT INTO siga.projeto_tipo (tipo_cod, tipo_desc) VALUES(?, ?)";
		template.update(sql, projetoTipo.getProjetoTipoCodigo(), projetoTipo.getProjetoTipoDescricao());
	}

	@Override
	public void atualizarCodigoProjetoTipo(ProjetoTipo projetoTipo) {
		log.info("Atualizando codigo..." + projetoTipo.getProjetoTipoCodigo());
		final String sql = "UPDATE siga.projeto_tipo SET tipo_cod=? WHERE tipo_cod=?";
		template.update(sql, projetoTipo.getProjetoTipoCodigo(), projetoTipo.getProjetoTipoCodigo());
	}

	@Override
	public void atualizarDescricaoProjetoTipo(ProjetoTipo projetoTipo) {
		log.info("Atualizando descricção... " + projetoTipo.getProjetoTipoDescricao());
		final String sql = "UPDATE siga.projeto_tipo SET tipo_desc=? WHERE tipo_cod=?";
		template.update(sql, projetoTipo.getProjetoTipoDescricao(), projetoTipo.getProjetoTipoCodigo());
	}

	@Override
	public void deletarProjetoTipo(ProjetoTipo projetoTipo) {
		log.info("Deletando tipo de projeto..." + projetoTipo.getProjetoTipoCodigo() );
		final String sql = "DELETE FROM siga.projeto_tipo WHERE tipo_cod=?";
		template.update(sql, projetoTipo.getProjetoTipoCodigo());
	}

	@Override
	public List<ProjetoTipo> listarTodosProjetosTipos() {
		return template.query(QUERY, this::projetoTipoMapRow);
	}
	
	private ProjetoTipo projetoTipoMapRow(ResultSet rs, int numRow) throws SQLException {
		return new ProjetoTipo(rs.getString("tipo_cod"), rs.getString("tipo_desc"));
	}

	

	
}
