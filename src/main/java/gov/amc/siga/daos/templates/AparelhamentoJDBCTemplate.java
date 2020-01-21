package gov.amc.siga.daos.templates;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import gov.amc.siga.daos.interfaces.AparelhamentoDAO;
import gov.amc.siga.daos.mappers.AparelhamentoRowMapper;
import gov.amc.siga.models.Aparelhamento;

public class AparelhamentoJDBCTemplate implements AparelhamentoDAO, Serializable {


	private static final long serialVersionUID = 1L;
	private final String sqlSalvar = "INSERT INTO siga.aparelhamentos (aparelho_cod, projeto_id, quantidade) VALUES (?, ?, ?)";
    private final String sqlListarTodos = "SELECT aparelho_cod, PROJETO_ID, QUANTIDADE FROM SIGA.APARELHAMENTOS";
    private final String sqlDeletar = "DELETE FROM SIGA.APARELHAMENTOS WHERE PROJETO_ID = ?";
    private final String sqlAtualizarQuantidade = "UPDATE SIGA.APARELHAMENTO SET QUANTIDADE = ? WHERE APARELHO_COD = ?";
    private final String sqlAtualizarCodigo = "UPDATE SIGA.APARELHAMENTO SET APARELHO_COD = ? WHERE PROJETO_ID = ?";
    private DataSource dataSource;    
    
    @Override
    public void setDataSource(DataSource ds){
        this.dataSource = ds;
    }

    @Override
    public void salvar(String aparelhamentoCodigo, long projetoId, Double quantidade) {
        JdbcTemplate insert = new JdbcTemplate(dataSource);
        insert.update(sqlSalvar, new Object[] {aparelhamentoCodigo, projetoId, quantidade});
    }

    @Override
    public void deletar(String aparelhamentoCodigo, long projetoId) {
        JdbcTemplate deletar = new JdbcTemplate(dataSource);
        deletar.update(sqlDeletar, new Object[]{ aparelhamentoCodigo, projetoId });
    }

    @Override
    public void atualizarQuantidade(long projetoId, String aparelhamentoCodigo, Double quantidade) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        select.update(sqlAtualizarQuantidade, new Object[]{ projetoId, aparelhamentoCodigo, quantidade });
    }

    @Override
    public void atualizarCodigo(long projetoId, String aparelhamentoCodigo, Double quantidade) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        select.update(sqlAtualizarCodigo, new Object[]{projetoId, aparelhamentoCodigo, quantidade});
    }

    @Override
    public List<Aparelhamento> listarAparelhamentos() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query(sqlListarTodos, new AparelhamentoRowMapper());
    }
}
