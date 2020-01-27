package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Situacao implements Serializable {

	private static final long serialVersionUID = 1L;

	private String situacaoCodigo;
	private long projetoId;

	public Situacao() {
	}

	public Situacao(String situacaoCodigo, long projetoId) {
		super();
		this.situacaoCodigo = situacaoCodigo;
		this.projetoId = projetoId;
	}

	public String getSituacaoCodigo() {
		return situacaoCodigo;
	}

	public void setSituacaoCodigo(String situacaoCodigo) {
		this.situacaoCodigo = situacaoCodigo;
	}

	public long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(long projetoId) {
		this.projetoId = projetoId;
	}

	@Override
	public String toString() {
		return "Situacao [situacaoCodigo=" + situacaoCodigo + ", projetoId=" + projetoId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (projetoId ^ (projetoId >>> 32));
		result = prime * result + ((situacaoCodigo == null) ? 0 : situacaoCodigo.hashCode());
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
		Situacao other = (Situacao) obj;
		if (projetoId != other.projetoId)
			return false;
		if (situacaoCodigo == null) {
			if (other.situacaoCodigo != null)
				return false;
		} else if (!situacaoCodigo.equals(other.situacaoCodigo))
			return false;
		return true;
	}

	
	

}
