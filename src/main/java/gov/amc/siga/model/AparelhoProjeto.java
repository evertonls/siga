package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class AparelhoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long aparelhamentoId;
	private Long projetoId;
	private String aparelhamentoCodigo;
	private Double quantidade;

	public AparelhoProjeto() {
	}

	public AparelhoProjeto(Long aparelhamentoId, Long projetoId, String aparelhamentoCodigo, Double quantidade) {
		super();
		this.aparelhamentoId = aparelhamentoId;
		this.projetoId = projetoId;
		this.aparelhamentoCodigo = aparelhamentoCodigo;
		this.quantidade = quantidade;
	}

	public Long getAparelhamentoId() {
		return aparelhamentoId;
	}

	public void setAparelhamentoId(Long aparelhamentoId) {
		this.aparelhamentoId = aparelhamentoId;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public String getAparelhamentoCodigo() {
		return aparelhamentoCodigo;
	}

	public void setAparelhamentoCodigo(String aparelhamentoCodigo) {
		this.aparelhamentoCodigo = aparelhamentoCodigo;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Aparelhamento [aparelhamentoId=" + aparelhamentoId + ", projetoId=" + projetoId
				+ ", aparelhamentoCodigo=" + aparelhamentoCodigo + ", quantidade=" + quantidade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aparelhamentoCodigo == null) ? 0 : aparelhamentoCodigo.hashCode());
		result = prime * result + ((aparelhamentoId == null) ? 0 : aparelhamentoId.hashCode());
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
		if (aparelhamentoCodigo == null) {
			if (other.aparelhamentoCodigo != null)
				return false;
		} else if (!aparelhamentoCodigo.equals(other.aparelhamentoCodigo))
			return false;
		if (aparelhamentoId == null) {
			if (other.aparelhamentoId != null)
				return false;
		} else if (!aparelhamentoId.equals(other.aparelhamentoId))
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
