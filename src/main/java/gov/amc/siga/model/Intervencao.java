package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Intervencao implements Serializable{

	private static final long serialVersionUID = 1L;

	private String intervencaoCodigo;
	private long projetoId;
	private int quantidade;
	
	public Intervencao() {	}

	public Intervencao(String intervencaoCodigo, long projetoId, int quantidade) {
		this.intervencaoCodigo = intervencaoCodigo;
		this.projetoId = projetoId;
		this.quantidade = quantidade;
	}

	public String getIntervencaoCodigo() {
		return intervencaoCodigo;
	}

	public void setIntervencaoCodigo(String intervencaoCodigo) {
		this.intervencaoCodigo = intervencaoCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(long projetoId) {
		this.projetoId = projetoId;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Intervencao [intervencaoCodigo=" + intervencaoCodigo + ", projetoId=" + projetoId + ", quantidade="
				+ quantidade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((intervencaoCodigo == null) ? 0 : intervencaoCodigo.hashCode());
		result = prime * result + (int) (projetoId ^ (projetoId >>> 32));
		result = prime * result + quantidade;
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
		Intervencao other = (Intervencao) obj;
		if (intervencaoCodigo == null) {
			if (other.intervencaoCodigo != null)
				return false;
		} else if (!intervencaoCodigo.equals(other.intervencaoCodigo))
			return false;
		if (projetoId != other.projetoId)
			return false;
		if (quantidade != other.quantidade)
			return false;
		return true;
	}
	
	

}
