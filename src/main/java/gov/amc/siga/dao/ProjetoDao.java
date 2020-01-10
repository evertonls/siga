package gov.amc.siga.dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import gov.amc.siga.model.Projeto;

public interface ProjetoDao {

	public Projeto getByID(long id);

	public Projeto getByNumero(String numero);

	public Projeto getByContrato(String contrato);

	public Projeto getByDataCriacao(Date dataCriacao);

	public Projeto getByDataInicial(Date dataInicial);

	public Projeto getByDataPrevista(Date dataPrevista);

	public Projeto getByRecape(Boolean recape);

	public List<Projeto> getAll();

	public List<Projeto> getAllByDateInterval(LocalDate dataInicial, LocalDate dataFinal);

	public long gravar(Projeto projeto);

	public void atualizar(Projeto projeto);

	public void alterarProjeto(Projeto projeto);

}