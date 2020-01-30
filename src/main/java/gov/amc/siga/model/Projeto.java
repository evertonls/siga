package gov.amc.siga.model;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Projeto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long projetoId;
	private Integer numeroProjeto;
	private String prancha;
	private String revisao;
	private String contrato;
	private String obsevacao;
	private String projetoObra;
	private String prioridade;
	private String ciRecape;
	private Boolean isRecape;
	private Boolean isRecapeExecutado;
	private String localRecape;
	private LocalDate dataCriacaoProjeto;
	private LocalDate dataPrevista;
	private LocalDate dataEquipe;
	private LocalDate dataInicial;
	private LocalDate dataExecucaoRecape;

	public Projeto() {
	}

	public Projeto(Long projetoId, Integer numeroProjeto, String prancha, String revisao, String contrato,
			String obsevacao, String projetoObra, String prioridade, String ciRecape, Boolean isRecape,
			Boolean isRecapeExecutado, String localRecape, LocalDate dataCriacaoProjeto, LocalDate dataPrevista,
			LocalDate dataEquipe, LocalDate dataInicial, LocalDate dataExecucaoRecape) {
		super();
		this.projetoId = projetoId;
		this.numeroProjeto = numeroProjeto;
		this.prancha = prancha;
		this.revisao = revisao;
		this.contrato = contrato;
		this.obsevacao = obsevacao;
		this.projetoObra = projetoObra;
		this.prioridade = prioridade;
		this.ciRecape = ciRecape;
		this.isRecape = isRecape;
		this.isRecapeExecutado = isRecapeExecutado;
		this.localRecape = localRecape;
		this.dataCriacaoProjeto = dataCriacaoProjeto;
		this.dataPrevista = dataPrevista;
		this.dataEquipe = dataEquipe;
		this.dataInicial = dataInicial;
		this.dataExecucaoRecape = dataExecucaoRecape;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public Integer getNumeroProjeto() {
		return numeroProjeto;
	}

	public void setNumeroProjeto(Integer numeroProjeto) {
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

	public String getCiRecape() {
		return ciRecape;
	}

	public void setCiRecape(String ciRecape) {
		this.ciRecape = ciRecape;
	}

	public Boolean getIsRecape() {
		return isRecape;
	}

	public void setIsRecape(Boolean isRecape) {
		this.isRecape = isRecape;
	}

	public Boolean getIsRecapeExecutado() {
		return isRecapeExecutado;
	}

	public void setIsRecapeExecutado(Boolean isRecapeExecutado) {
		this.isRecapeExecutado = isRecapeExecutado;
	}

	public String getLocalRecape() {
		return localRecape;
	}

	public void setLocalRecape(String localRecape) {
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

	@Override
	public String toString() {
		return "Projeto" + "\n" + "[projetoId=" + projetoId + ", numeroProjeto=" + numeroProjeto + ", prancha=" + prancha
				+ ", revisao=" + revisao + ", contrato=" + contrato + ", obsevacao=" + obsevacao + ", projetoObra="
				+ projetoObra + ", prioridade=" + prioridade + ", ciRecape=" + ciRecape + ", isRecape=" + isRecape
				+ ", isRecapeExecutado=" + isRecapeExecutado + ", localRecape=" + localRecape + ", dataCriacaoProjeto="
				+ dataCriacaoProjeto + ", dataPrevista=" + dataPrevista + ", dataEquipe=" + dataEquipe
				+ ", dataInicial=" + dataInicial + ", dataExecucaoRecape=" + dataExecucaoRecape + "]" + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciRecape == null) ? 0 : ciRecape.hashCode());
		result = prime * result + ((contrato == null) ? 0 : contrato.hashCode());
		result = prime * result + ((dataCriacaoProjeto == null) ? 0 : dataCriacaoProjeto.hashCode());
		result = prime * result + ((dataEquipe == null) ? 0 : dataEquipe.hashCode());
		result = prime * result + ((dataExecucaoRecape == null) ? 0 : dataExecucaoRecape.hashCode());
		result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
		result = prime * result + ((dataPrevista == null) ? 0 : dataPrevista.hashCode());
		result = prime * result + ((isRecape == null) ? 0 : isRecape.hashCode());
		result = prime * result + ((isRecapeExecutado == null) ? 0 : isRecapeExecutado.hashCode());
		result = prime * result + ((localRecape == null) ? 0 : localRecape.hashCode());
		result = prime * result + ((numeroProjeto == null) ? 0 : numeroProjeto.hashCode());
		result = prime * result + ((obsevacao == null) ? 0 : obsevacao.hashCode());
		result = prime * result + ((prancha == null) ? 0 : prancha.hashCode());
		result = prime * result + ((prioridade == null) ? 0 : prioridade.hashCode());
		result = prime * result + ((projetoId == null) ? 0 : projetoId.hashCode());
		result = prime * result + ((projetoObra == null) ? 0 : projetoObra.hashCode());
		result = prime * result + ((revisao == null) ? 0 : revisao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (ciRecape == null) {
			if (other.ciRecape != null)
				return false;
		} else if (!ciRecape.equals(other.ciRecape))
			return false;
		if (contrato == null) {
			if (other.contrato != null)
				return false;
		} else if (!contrato.equals(other.contrato))
			return false;
		if (dataCriacaoProjeto == null) {
			if (other.dataCriacaoProjeto != null)
				return false;
		} else if (!dataCriacaoProjeto.equals(other.dataCriacaoProjeto))
			return false;
		if (dataEquipe == null) {
			if (other.dataEquipe != null)
				return false;
		} else if (!dataEquipe.equals(other.dataEquipe))
			return false;
		if (dataExecucaoRecape == null) {
			if (other.dataExecucaoRecape != null)
				return false;
		} else if (!dataExecucaoRecape.equals(other.dataExecucaoRecape))
			return false;
		if (dataInicial == null) {
			if (other.dataInicial != null)
				return false;
		} else if (!dataInicial.equals(other.dataInicial))
			return false;
		if (dataPrevista == null) {
			if (other.dataPrevista != null)
				return false;
		} else if (!dataPrevista.equals(other.dataPrevista))
			return false;
		if (isRecape == null) {
			if (other.isRecape != null)
				return false;
		} else if (!isRecape.equals(other.isRecape))
			return false;
		if (isRecapeExecutado == null) {
			if (other.isRecapeExecutado != null)
				return false;
		} else if (!isRecapeExecutado.equals(other.isRecapeExecutado))
			return false;
		if (localRecape == null) {
			if (other.localRecape != null)
				return false;
		} else if (!localRecape.equals(other.localRecape))
			return false;
		if (numeroProjeto == null) {
			if (other.numeroProjeto != null)
				return false;
		} else if (!numeroProjeto.equals(other.numeroProjeto))
			return false;
		if (obsevacao == null) {
			if (other.obsevacao != null)
				return false;
		} else if (!obsevacao.equals(other.obsevacao))
			return false;
		if (prancha == null) {
			if (other.prancha != null)
				return false;
		} else if (!prancha.equals(other.prancha))
			return false;
		if (prioridade == null) {
			if (other.prioridade != null)
				return false;
		} else if (!prioridade.equals(other.prioridade))
			return false;
		if (projetoId == null) {
			if (other.projetoId != null)
				return false;
		} else if (!projetoId.equals(other.projetoId))
			return false;
		if (projetoObra == null) {
			if (other.projetoObra != null)
				return false;
		} else if (!projetoObra.equals(other.projetoObra))
			return false;
		if (revisao == null) {
			if (other.revisao != null)
				return false;
		} else if (!revisao.equals(other.revisao))
			return false;
		return true;
	}

}
