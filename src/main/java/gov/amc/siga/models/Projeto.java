package gov.amc.siga.models;

import java.io.Serializable;
import java.text.Collator;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Projeto implements Comparable<Projeto>, Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idProjeto;
	private int numeroProjeto;
	private String prancha;
	private String revisao;
	private String contrato;
	private Date dataCriacaoProjeto;
	private String obsevacao;
	private String projetoObra;
	private String prioridade;
	private Date dataPrevista;
	private Date dataEquipe;
	private Date dataInicial;
	private Boolean isRecape;
	private String ciRecape;
	private String localRecape;
	private Boolean isRecapeExecutado;
	private Date dataExecucaoRecape;

	public Projeto() {
	}

	public Projeto(Long idProjeto, int numeroProjeto, String prancha, String revisao, String contrato,
			Date dataCriacaoProjeto, String obsevacao, String projetoObra, String prioridade, Date dataPrevista,
			Date dataEquipe, Date dataInicial, Boolean isRecape, String ciRecape, String localRecape,
			Boolean isRecapeExecutado, Date dataExecucaoRecape) {
		super();
		this.idProjeto = idProjeto;
		this.numeroProjeto = numeroProjeto;
		this.prancha = prancha;
		this.revisao = revisao;
		this.contrato = contrato;
		this.dataCriacaoProjeto = dataCriacaoProjeto;
		this.obsevacao = obsevacao;
		this.projetoObra = projetoObra;
		this.prioridade = prioridade;
		this.dataPrevista = dataPrevista;
		this.dataEquipe = dataEquipe;
		this.dataInicial = dataInicial;
		this.isRecape = isRecape;
		this.ciRecape = ciRecape;
		this.localRecape = localRecape;
		this.isRecapeExecutado = isRecapeExecutado;
		this.dataExecucaoRecape = dataExecucaoRecape;
	}

	public Long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public int getNumeroProjeto() {
		return numeroProjeto;
	}

	public void setNumeroProjeto(int numero) {
		this.numeroProjeto = numero;
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

	public Date getDataCriacaoProjeto() {
		return dataCriacaoProjeto;
	}

	public void setDataCriacaoProjeto(Date dataCriacaoProjeto) {
		this.dataCriacaoProjeto = dataCriacaoProjeto;
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

	public Date getDataPrevista() {
		return dataPrevista;
	}

	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public Date getDataEquipe() {
		return dataEquipe;
	}

	public void setDataEquipe(Date dataEquipe) {
		this.dataEquipe = dataEquipe;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
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

	public String getLocalRecape() {
		return localRecape;
	}

	public void setLocalRecape(String localRecape) {
		this.localRecape = localRecape;
	}

	public Boolean getIsRecapeExecutado() {
		return isRecapeExecutado;
	}

	public void setIsRecapeExecutado(Boolean isRecapeExecutado) {
		this.isRecapeExecutado = isRecapeExecutado;
	}

	public Date getDataExecucaoRecape() {
		return dataExecucaoRecape;
	}

	public void setDataExecucaoRecape(Date dataExecucaoRecape) {
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
