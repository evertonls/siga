package gov.amc.siga.daos.mappers;

import gov.amc.siga.models.Aparelhamento;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AparelhamentoRowMapper implements RowMapper<Aparelhamento> {

    @Override
    public Aparelhamento mapRow(ResultSet rs, int rowNum) throws SQLException {
        AparelhamentoResultSetExtractor extractor = new AparelhamentoResultSetExtractor();
        return extractor.extractData(rs);
    }
}
