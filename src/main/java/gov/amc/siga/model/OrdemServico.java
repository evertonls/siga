package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class OrdemServico implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long ordemServicoId;
	private Integer numero;
	private String medicao;
	private Long projetoId;
	private String observacaoVistoria;
	private String observacao;

	public OrdemServico() {
	}

	public OrdemServico(Long ordemServicoId, Integer numero, String medicao, Long projetoId, String observacaoVistoria,
			String observacao) {
		super();
		this.ordemServicoId = ordemServicoId;
		this.numero = numero;
		this.medicao = medicao;
		this.projetoId = projetoId;
		this.observacaoVistoria = observacaoVistoria;
		this.observacao = observacao;
	}

	public Long getOrdemServicoId() {
		return ordemServicoId;
	}

	public void setOrdemServicoId(Long ordemServicoId) {
		this.ordemServicoId = ordemServicoId;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getMedicao() {
		return medicao;
	}

	public void setMedicao(String medicao) {
		this.medicao = medicao;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public String getObservacaoVistoria() {
		return observacaoVistoria;
	}

	public void setObservacaoVistoria(String observacaoVistoria) {
		this.observacaoVistoria = observacaoVistoria;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "OrdemServico [ordemServicoId=" + ordemServicoId + ", numero=" + numero + ", medicao=" + medicao
				+ ", projetoId=" + projetoId + ", observacaoVistoria=" + observacaoVistoria + ", observacao="
				+ observacao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((medicao == null) ? 0 : medicao.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + ((observacaoVistoria == null) ? 0 : observacaoVistoria.hashCode());
		result = prime * result + ((ordemServicoId == null) ? 0 : ordemServicoId.hashCode());
		result = prime * result + ((projetoId == null) ? 0 : projetoId.hashCode());
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
		OrdemServico other = (OrdemServico) obj;
		if (medicao == null) {
			if (other.medicao != null)
				return false;
		} else if (!medicao.equals(other.medicao))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (observacaoVistoria == null) {
			if (other.observacaoVistoria != null)
				return false;
		} else if (!observacaoVistoria.equals(other.observacaoVistoria))
			return false;
		if (ordemServicoId == null) {
			if (other.ordemServicoId != null)
				return false;
		} else if (!ordemServicoId.equals(other.ordemServicoId))
			return false;
		if (projetoId == null) {
			if (other.projetoId != null)
				return false;
		} else if (!projetoId.equals(other.projetoId))
			return false;
		return true;
	}

}
