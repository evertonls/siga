package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long enderecoId;
	private Long longradouroId;
	private Long longradouroCruzamento;
	private Long longradouroTrecho;
	private String regional;
	private String divisao;
	private Long bairroId;
	private Long projetoId;

	public Endereco() {
	}

	public Endereco(Long enderecoId, Long longradouroId, Long longradouroCruzamento, Long longradouroTrecho,
			String regional, String divisao, Long bairroId, Long projetoId) {
		super();
		this.enderecoId = enderecoId;
		this.longradouroId = longradouroId;
		this.longradouroCruzamento = longradouroCruzamento;
		this.longradouroTrecho = longradouroTrecho;
		this.regional = regional;
		this.divisao = divisao;
		this.bairroId = bairroId;
		this.projetoId = projetoId;
	}

	public Long getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(Long enderecoId) {
		this.enderecoId = enderecoId;
	}

	public Long getLongradouroId() {
		return longradouroId;
	}

	public void setLongradouroId(Long longradouroId) {
		this.longradouroId = longradouroId;
	}

	public Long getLongradouroCruzamento() {
		return longradouroCruzamento;
	}

	public void setLongradouroCruzamento(Long longradouroCruzamento) {
		this.longradouroCruzamento = longradouroCruzamento;
	}

	public Long getLongradouroTrecho() {
		return longradouroTrecho;
	}

	public void setLongradouroTrecho(Long longradouroTrecho) {
		this.longradouroTrecho = longradouroTrecho;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public String getDivisao() {
		return divisao;
	}

	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}

	public Long getBairroId() {
		return bairroId;
	}

	public void setBairroId(Long bairroId) {
		this.bairroId = bairroId;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	@Override
	public String toString() {
		return "Endereco [enderecoId=" + enderecoId + ", longradouroId=" + longradouroId + ", longradouroCruzamento="
				+ longradouroCruzamento + ", longradouroTrecho=" + longradouroTrecho + ", regional=" + regional
				+ ", divisao=" + divisao + ", bairroId=" + bairroId + ", projetoId=" + projetoId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairroId == null) ? 0 : bairroId.hashCode());
		result = prime * result + ((divisao == null) ? 0 : divisao.hashCode());
		result = prime * result + ((enderecoId == null) ? 0 : enderecoId.hashCode());
		result = prime * result + ((longradouroCruzamento == null) ? 0 : longradouroCruzamento.hashCode());
		result = prime * result + ((longradouroId == null) ? 0 : longradouroId.hashCode());
		result = prime * result + ((longradouroTrecho == null) ? 0 : longradouroTrecho.hashCode());
		result = prime * result + ((projetoId == null) ? 0 : projetoId.hashCode());
		result = prime * result + ((regional == null) ? 0 : regional.hashCode());
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
		Endereco other = (Endereco) obj;
		if (bairroId == null) {
			if (other.bairroId != null)
				return false;
		} else if (!bairroId.equals(other.bairroId))
			return false;
		if (divisao == null) {
			if (other.divisao != null)
				return false;
		} else if (!divisao.equals(other.divisao))
			return false;
		if (enderecoId == null) {
			if (other.enderecoId != null)
				return false;
		} else if (!enderecoId.equals(other.enderecoId))
			return false;
		if (longradouroCruzamento == null) {
			if (other.longradouroCruzamento != null)
				return false;
		} else if (!longradouroCruzamento.equals(other.longradouroCruzamento))
			return false;
		if (longradouroId == null) {
			if (other.longradouroId != null)
				return false;
		} else if (!longradouroId.equals(other.longradouroId))
			return false;
		if (longradouroTrecho == null) {
			if (other.longradouroTrecho != null)
				return false;
		} else if (!longradouroTrecho.equals(other.longradouroTrecho))
			return false;
		if (projetoId == null) {
			if (other.projetoId != null)
				return false;
		} else if (!projetoId.equals(other.projetoId))
			return false;
		if (regional == null) {
			if (other.regional != null)
				return false;
		} else if (!regional.equals(other.regional))
			return false;
		return true;
	}

}
