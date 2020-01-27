package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ProjetoTipificacoes implements Serializable {

	private static final long serialVersionUID = 1L;

	private String projetoTipoCodigo;
	private long projetoId;

	public ProjetoTipificacoes() {
	}

	public ProjetoTipificacoes(String projetoTipoCodigo, long projetoId) {
		this.projetoTipoCodigo = projetoTipoCodigo;
		this.projetoId = projetoId;
	}

	public String getProjetoTipoCodigo() {
		return projetoTipoCodigo;
	}

	public void setProjetoTipoCodigo(String projetoTipoCodigo) {
		this.projetoTipoCodigo = projetoTipoCodigo;
	}

	public long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(long projetoId) {
		this.projetoId = projetoId;
	}

	@Override
	public String toString() {
		return "ProjetoTipificacoes [projetoTipoCodigo=" + projetoTipoCodigo + ", projetoId=" + projetoId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (projetoId ^ (projetoId >>> 32));
		result = prime * result + ((projetoTipoCodigo == null) ? 0 : projetoTipoCodigo.hashCode());
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
		ProjetoTipificacoes other = (ProjetoTipificacoes) obj;
		if (projetoId != other.projetoId)
			return false;
		if (projetoTipoCodigo == null) {
			if (other.projetoTipoCodigo != null)
				return false;
		} else if (!projetoTipoCodigo.equals(other.projetoTipoCodigo))
			return false;
		return true;
	}
	
	

}
