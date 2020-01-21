package gov.amc.siga.daos.interfaces;

import gov.amc.siga.models.Aparelhamento;

import javax.sql.DataSource;
import java.util.List;

public interface AparelhamentoDAO {

    void setDataSource(DataSource ds);

    void salvar(String aparelhamentoCodigo, long projetoId, Double quantidade);

    void deletar(String aparelhamentoCodigo, long projetoId);

    void atualizarQuantidade(long projetoId, String aparelhamentoCodigo, Double quantidade);

    void atualizarCodigo(long projetoId, String AparelhamentoCodigo, Double quantidade);

    List<Aparelhamento> listarAparelhamentos();

}
