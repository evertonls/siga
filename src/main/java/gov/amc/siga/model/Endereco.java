package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	private long longradouroId;
	private String regional;
	private String divisao;
	private long bairroId;
	private long projetoId;

	public Endereco() {
	}

	public Endereco(long longradouroId, String regional, String divisao, long bairroId, long projetoId) {
		this.longradouroId = longradouroId;
		this.regional = regional;
		this.divisao = divisao;
		this.bairroId = bairroId;
		this.projetoId = projetoId;
	}

	public long getLongradouroId() {
		return longradouroId;
	}

	public void setLongradouroId(long longradouroId) {
		this.longradouroId = longradouroId;
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

	public long getBairroId() {
		return bairroId;
	}

	public void setBairroId(long bairroId) {
		this.bairroId = bairroId;
	}

	public long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(long projetoId) {
		this.projetoId = projetoId;
	}

	@Override
	public String toString() {
		return "Endereco [longradouroId=" + longradouroId + ", regional=" + regional + ", divisao=" + divisao
				+ ", bairroId=" + bairroId + ", projetoId=" + projetoId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (bairroId ^ (bairroId >>> 32));
		result = prime * result + ((divisao == null) ? 0 : divisao.hashCode());
		result = prime * result + (int) (longradouroId ^ (longradouroId >>> 32));
		result = prime * result + (int) (projetoId ^ (projetoId >>> 32));
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
		if (bairroId != other.bairroId)
			return false;
		if (divisao == null) {
			if (other.divisao != null)
				return false;
		} else if (!divisao.equals(other.divisao))
			return false;
		if (longradouroId != other.longradouroId)
			return false;
		if (projetoId != other.projetoId)
			return false;
		if (regional == null) {
			if (other.regional != null)
				return false;
		} else if (!regional.equals(other.regional))
			return false;
		return true;
	}
	
	

}
