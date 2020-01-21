package gov.amc.siga.daos.interfaces;

import java.util.Calendar;
import java.util.List;

import javax.sql.DataSource;

import gov.amc.siga.models.Projeto;

public interface ProjetoDAO {
    void setDataSource(DataSource ds);

    void salvar(int numeroProjeto, String prancha, String revisao, String contrato,
    		Calendar dataCriacaoProjeto, String obsevacao, String projetoObra, String prioridade,
    		Calendar dataPrevista, Calendar dataEquipe, Calendar dataInicial, Boolean isRecape, String ciRecape,
                String localRecape, Boolean isRecapeExecutado, Calendar dataExecucaoRecape);

    void deletar(long projetoId, int numeroProjeto);

    void atualizar(long projetoId, int numeroProjeto);

    List<Projeto> listarPorNumero(int numeroProjeto);

    List<Projeto> listarTodosProjetos();
}
