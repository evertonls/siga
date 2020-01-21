package gov.amc.siga.daos.mappers;

import gov.amc.siga.models.Projeto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjetoRowMapper implements RowMapper<Projeto> {


    @Override
    public Projeto mapRow(ResultSet rs, int rowNum) throws SQLException {
        ProjetoResultSetExtractor extractor = new ProjetoResultSetExtractor();
        return extractor.extractData(rs);
    }
}
