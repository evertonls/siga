package gov.amc.siga.daos.mappers;

import gov.amc.siga.models.Aparelhamento;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AparelhamentoResultSetExtractor implements ResultSetExtractor<Aparelhamento> {

    @Override
    public Aparelhamento extractData(ResultSet rs) throws SQLException, DataAccessException {
        Aparelhamento aparelhamentos = new Aparelhamento();
        aparelhamentos.setProjetoId(rs.getLong(1));
        aparelhamentos.setAparelhamentoCodigo(rs.getString(2));
        aparelhamentos.setQuantidade(rs.getDouble(3));
        return aparelhamentos;
    }
}
