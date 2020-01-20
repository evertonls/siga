package gov.amc.siga.daos.interfaces;

import gov.amc.siga.models.Aparelhamentos;

import javax.sql.DataSource;
import java.util.List;

public interface AparelhamentosDAO {

    public void setDataSource(DataSource dataSource);

    public void salvar(Long projetoId, String aparelhamentoCodigo, Double quantidade);

    public void deletar(String aparelhamentoCodigo, Long projetoId);

    public void atualizarQuantidade(Long projetoId, String aparelhamentoCodigo, Double quantidade);

    public void atualizarCodigo(Long projetoId, String AparelhamentoCodigo, Double quantidade);

    public List<Aparelhamentos> listarAparelhamentos();

}
