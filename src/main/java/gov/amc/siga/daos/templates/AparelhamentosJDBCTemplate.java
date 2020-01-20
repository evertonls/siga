package gov.amc.siga.daos.templates;

import gov.amc.siga.daos.interfaces.AparelhamentosDAO;
import gov.amc.siga.mappers.AparelhamentosRowMapper;
import gov.amc.siga.mappers.AparelhoRowMapper;
import gov.amc.siga.models.Aparelhamentos;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.List;

public class AparelhamentosJDBCTemplate implements AparelhamentosDAO, Serializable {

    private final String sqlSalvar = "INSERT INTO siga.aparelhamentos (aparelho_cod, projeto_id, quantidade) VALUES (?, ?, ?) ON CONFLICT (APARELHO_COD) DO NOTHING";
    private final String sqlListarTodos = "SELECT APARELHO_COD, PROJETO_ID, QUANTIDADE FROM SIGA.APARELHAMENTOS";
    private final String sqlDeletar = "DELETE FROM SIGA.APARELHAMENTOS WHERE PROJETO_ID = ?";
    private final String sqlAtualizarQuantidade = "UPDATE SIGA.APARELHAMENTO SET QUANTIDADE = ? WHERE APARELHO_COD = ?";
    private final String sqlAtualizarCodigo = "UPDATE SIGA.APARELHAMENTO SET APARELHO_COD = ? WHERE PROJETO_ID = ?";

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void salvar(Long projetoId, String aparelhamentoCodigo, Double quantidade) {
        JdbcTemplate insert = new JdbcTemplate(dataSource);
        insert.update(sqlSalvar, new Object[] {projetoId, aparelhamentoCodigo, quantidade});
    }

    @Override
    public void deletar(String aparelhamentoCodigo, Long projetoId) {
        JdbcTemplate deletar = new JdbcTemplate(dataSource);
        deletar.update(sqlDeletar, new Object[]{ aparelhamentoCodigo, projetoId });
    }

    @Override
    public void atualizarQuantidade(Long projetoId, String aparelhamentoCodigo, Double quantidade) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        select.update(sqlAtualizarQuantidade, new Object[]{ projetoId, aparelhamentoCodigo, quantidade });
    }

    @Override
    public void atualizarCodigo(Long projetoId, String aparelhamentoCodigo, Double quantidade) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        select.update(sqlAtualizarCodigo, new Object[]{projetoId, aparelhamentoCodigo, quantidade});
    }

    @Override
    public List<Aparelhamentos> listarAparelhamentos() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query(sqlListarTodos, new AparelhamentosRowMapper());
    }
}
