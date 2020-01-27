package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Classificacao implements Serializable{

	private static final long serialVersionUID = 1L;
	private String classificacaoCodigo;
	private Long projetoId;
	
	public Classificacao() {	}

	public Classificacao(String classificacaoCodigo, Long projetoId) {
		this.classificacaoCodigo = classificacaoCodigo;
		this.projetoId = projetoId;
	}

	public String getClassificacaoCodigo() {
		return classificacaoCodigo;
	}

	public void setClassificacaoCod(String classificacaoCodigo) {
		this.classificacaoCodigo = classificacaoCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	
	
	@Override
	public String toString() {
		return "Classificacao [classificacaoCodigo=" + classificacaoCodigo + ", projetoId=" + projetoId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classificacaoCodigo == null) ? 0 : classificacaoCodigo.hashCode());
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
		Classificacao other = (Classificacao) obj;
		if (classificacaoCodigo == null) {
			if (other.classificacaoCodigo != null)
				return false;
		} else if (!classificacaoCodigo.equals(other.classificacaoCodigo))
			return false;
		if (projetoId == null) {
			if (other.projetoId != null)
				return false;
		} else if (!projetoId.equals(other.projetoId))
			return false;
		return true;
	}
	
	

		
}
