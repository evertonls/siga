package gov.amc.siga.mappers;

import gov.amc.siga.daos.extractors.AparelhamentoResultSetExtractor;
import gov.amc.siga.models.Aparelhamentos;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AparelhamentosRowMapper implements RowMapper<Aparelhamentos> {

    @Override
    public Aparelhamentos mapRow(ResultSet rs, int rowNum) throws SQLException {
        AparelhamentoResultSetExtractor extractor = new AparelhamentoResultSetExtractor();
        return extractor.extractData(rs);
    }
}
