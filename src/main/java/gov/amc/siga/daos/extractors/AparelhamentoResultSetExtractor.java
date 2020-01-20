package gov.amc.siga.daos.extractors;

import gov.amc.siga.models.Aparelhamentos;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AparelhamentoResultSetExtractor implements ResultSetExtractor<Aparelhamentos> {

    @Override
    public Aparelhamentos extractData(ResultSet rs) throws SQLException, DataAccessException {
        Aparelhamentos aparelhamentos = new Aparelhamentos();
        aparelhamentos.setProjetoId(rs.getLong(1));
        aparelhamentos.setAparelhamentoCodigo(rs.getString(2));
        aparelhamentos.setQuantidade(rs.getDouble(3));
        return aparelhamentos;
    }
}
