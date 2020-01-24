package gov.amc.siga.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import gov.amc.siga.model.Projeto;

public class ProjetoResultSetExtractor implements ResultSetExtractor<Projeto> {

	@Override
	public Projeto extractData(ResultSet rs) throws SQLException, DataAccessException {
		Projeto projeto = new Projeto();
		projeto.setProjetoId(rs.getLong("projeto_id"));
		projeto.setNumeroProjeto(rs.getInt("numero"));
		projeto.setPrancha(rs.getString("prancha"));
		projeto.setRevisao(rs.getString("revisao"));
		projeto.setContrato(rs.getString("revisao"));
		projeto.setDataCriacaoProjeto(rs.getDate("data_cria_proj").toLocalDate());
		projeto.setObsevacao(rs.getString("observacao"));
		projeto.setProjetoObra(rs.getString("proj_obra"));
		projeto.setPrioridade(rs.getString("prioridade"));
		projeto.setDataPrevista(rs.getDate("data_prevista").toLocalDate());
		projeto.setDataEquipe(rs.getDate("data_equipe").toLocalDate());
		projeto.setDataInicial(rs.getDate("data_inicial").toLocalDate());
		projeto.setIsRecape(rs.getBoolean("is_recape"));
		projeto.setCiRecape(rs.getString("ci_recape"));
		projeto.setLocalRecape(rs.getString("local_recape"));
		projeto.setIsRecapeExecutado(rs.getBoolean("is_execu_rec"));
		projeto.setDataExecucaoRecape(rs.getDate("data_exe_rec").toLocalDate());

		return projeto;
	}

}
