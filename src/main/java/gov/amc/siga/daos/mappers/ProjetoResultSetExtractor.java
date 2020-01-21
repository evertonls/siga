package gov.amc.siga.daos.mappers;

import gov.amc.siga.models.Projeto;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjetoResultSetExtractor implements ResultSetExtractor<Projeto> {
    @Override
    public Projeto extractData(ResultSet rs) throws SQLException, DataAccessException {
        Projeto projeto = new Projeto();
        projeto.setIdProjeto(rs.getLong(1));
        projeto.setNumeroProjeto(rs.getInt(2));
        projeto.setPrancha(rs.getString(3));
        projeto.setRevisao(rs.getString(4));
        projeto.setContrato(rs.getString(5));
        projeto.setDataCriacaoProjeto(rs.getDate(6));
        projeto.setObsevacao(rs.getString(7));
        projeto.setProjetoObra(rs.getString(8));
        projeto.setPrioridade(rs.getString(9));
        projeto.setDataPrevista(rs.getDate(10));
        projeto.setDataEquipe(rs.getDate(11));
        projeto.setDataInicial(rs.getDate(12));
        projeto.setIsRecape(rs.getBoolean(13));
        projeto.setCiRecape(rs.getString(14));
        projeto.setLocalRecape(rs.getString(15));
        projeto.setIsRecapeExecutado(rs.getBoolean(16));
        projeto.setDataExecucaoRecape(rs.getDate(17));
        return projeto;
    }
}
