package gov.amc.siga.model;

import java.io.Serializable;
import java.text.Collator;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Projeto implements Comparable<Projeto>, Serializable {

	private static final long serialVersionUID = 1L;

	private long idProjeto;
	private int numeroProjeto;
	private String prancha;
	private String revisao;
	private String contrato;
	private String obsevacao;
	private String projetoObra;
	private String prioridade;
	private Boolean isRecape;
	private String ciRecape;
	private Boolean isRecapeExecutado;
	private LocalDate localRecape;
	private LocalDate dataCriacaoProjeto;
	private LocalDate dataPrevista;
	private LocalDate dataEquipe;
	private LocalDate dataInicial;
	private LocalDate dataExecucaoRecape;

	public Projeto() {
	}

	public Projeto(long idProjeto, int numeroProjeto, String prancha, String revisao, String contrato, String obsevacao,
			String projetoObra, String prioridade, Boolean isRecape, String ciRecape, Boolean isRecapeExecutado,
			LocalDate localRecape, LocalDate dataCriacaoProjeto, LocalDate dataPrevista, LocalDate dataEquipe,
			LocalDate dataInicial, LocalDate dataExecucaoRecape) {
		super();
		this.idProjeto = idProjeto;
		this.numeroProjeto = numeroProjeto;
		this.prancha = prancha;
		this.revisao = revisao;
		this.contrato = contrato;
		this.obsevacao = obsevacao;
		this.projetoObra = projetoObra;
		this.prioridade = prioridade;
		this.isRecape = isRecape;
		this.ciRecape = ciRecape;
		this.isRecapeExecutado = isRecapeExecutado;
		this.localRecape = localRecape;
		this.dataCriacaoProjeto = dataCriacaoProjeto;
		this.dataPrevista = dataPrevista;
		this.dataEquipe = dataEquipe;
		this.dataInicial = dataInicial;
		this.dataExecucaoRecape = dataExecucaoRecape;
	}

	public long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public int getNumeroProjeto() {
		return numeroProjeto;
	}

	public void setNumeroProjeto(int numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}

	public String getPrancha() {
		return prancha;
	}

	public void setPrancha(String prancha) {
		this.prancha = prancha;
	}

	public String getRevisao() {
		return revisao;
	}

	public void setRevisao(String revisao) {
		this.revisao = revisao;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getObsevacao() {
		return obsevacao;
	}

	public void setObsevacao(String obsevacao) {
		this.obsevacao = obsevacao;
	}

	public String getProjetoObra() {
		return projetoObra;
	}

	public void setProjetoObra(String projetoObra) {
		this.projetoObra = projetoObra;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public Boolean getIsRecape() {
		return isRecape;
	}

	public void setIsRecape(Boolean isRecape) {
		this.isRecape = isRecape;
	}

	public String getCiRecape() {
		return ciRecape;
	}

	public void setCiRecape(String ciRecape) {
		this.ciRecape = ciRecape;
	}

	public Boolean getIsRecapeExecutado() {
		return isRecapeExecutado;
	}

	public void setIsRecapeExecutado(Boolean isRecapeExecutado) {
		this.isRecapeExecutado = isRecapeExecutado;
	}

	public LocalDate getLocalRecape() {
		return localRecape;
	}

	public void setLocalRecape(LocalDate localRecape) {
		this.localRecape = localRecape;
	}

	public LocalDate getDataCriacaoProjeto() {
		return dataCriacaoProjeto;
	}

	public void setDataCriacaoProjeto(LocalDate dataCriacaoProjeto) {
		this.dataCriacaoProjeto = dataCriacaoProjeto;
	}

	public LocalDate getDataPrevista() {
		return dataPrevista;
	}

	public void setDataPrevista(LocalDate dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public LocalDate getDataEquipe() {
		return dataEquipe;
	}

	public void setDataEquipe(LocalDate dataEquipe) {
		this.dataEquipe = dataEquipe;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getDataExecucaoRecape() {
		return dataExecucaoRecape;
	}

	public void setDataExecucaoRecape(LocalDate dataExecucaoRecape) {
		this.dataExecucaoRecape = dataExecucaoRecape;
	}

	public int hasCode() {
		return Objects.hash(numeroProjeto);
	}

	@Override
	public int compareTo(Projeto projeto) {
		Collator brCollator = Collator.getInstance(new Locale("pt", "BR"));
		brCollator.setStrength(Collator.PRIMARY);
		return brCollator.compare(numeroProjeto, projeto.getNumeroProjeto());
	}

}
