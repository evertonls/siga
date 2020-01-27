package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class OrdemServico implements Serializable {

	private static final long serialVersionUID = 1L;

	private long ordemServicoId;
	private int numero;
	private String medicao;
	private long projetoId;
	private String observacaoVistoria;
	private String observacao;

	public OrdemServico() {
	}

	public OrdemServico(long ordemServicoId, int numero, String medicao, long projetoId, String observacaoVistoria,
			String observacao) {
		this.ordemServicoId = ordemServicoId;
		this.numero = numero;
		this.medicao = medicao;
		this.projetoId = projetoId;
		this.observacaoVistoria = observacaoVistoria;
		this.observacao = observacao;
	}

	public long getOrdemServicoId() {
		return ordemServicoId;
	}

	public void setOrdemServicoId(long ordemServicoId) {
		this.ordemServicoId = ordemServicoId;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMedicao() {
		return medicao;
	}

	public void setMedicao(String medicao) {
		this.medicao = medicao;
	}

	public long getProjetoId() {
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
		result = prime * result + numero;
		result = prime * result + ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + ((observacaoVistoria == null) ? 0 : observacaoVistoria.hashCode());
		result = prime * result + (int) (ordemServicoId ^ (ordemServicoId >>> 32));
		result = prime * result + (int) (projetoId ^ (projetoId >>> 32));
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
		if (numero != other.numero)
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
		if (ordemServicoId != other.ordemServicoId)
			return false;
		if (projetoId != other.projetoId)
			return false;
		return true;
	}

}
