package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class AparelhoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private String aparelhoCodigo;
	private Double quantidade;

	public AparelhoProjeto() {
	}

	public AparelhoProjeto(String aparelhamentoCodigo, Long projetoId, Double quantidade) {
		super();
		this.projetoId = projetoId;
		this.aparelhoCodigo = aparelhamentoCodigo;
		this.quantidade = quantidade;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public String getAparelhoCodigo() {
		return aparelhoCodigo;
	}

	public void setAparelhoCodigo(String aparelhamentoCodigo) {
		this.aparelhoCodigo = aparelhamentoCodigo;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aparelhoCodigo == null) ? 0 : aparelhoCodigo.hashCode());
		result = prime * result + ((projetoId == null) ? 0 : projetoId.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
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
		AparelhoProjeto other = (AparelhoProjeto) obj;
		if (aparelhoCodigo == null) {
			if (other.aparelhoCodigo != null)
				return false;
		} else if (!aparelhoCodigo.equals(other.aparelhoCodigo))
			return false;
		if (projetoId == null) {
			if (other.projetoId != null)
				return false;
		} else if (!projetoId.equals(other.projetoId))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}

}
