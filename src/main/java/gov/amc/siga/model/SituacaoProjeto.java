package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class SituacaoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long situacoesId;
	private String situacaoCodigo;
	private Long projetoId;

	public SituacaoProjeto() {
	}

	public SituacaoProjeto(Long situacoesId, String situacaoCodigo, Long projetoId) {
		super();
		this.situacoesId = situacoesId;
		this.situacaoCodigo = situacaoCodigo;
		this.projetoId = projetoId;
	}

	public Long getSituacoesId() {
		return situacoesId;
	}

	public void setSituacoesId(Long situacoesId) {
		this.situacoesId = situacoesId;
	}

	public String getSituacaoCodigo() {
		return situacaoCodigo;
	}

	public void setSituacaoCodigo(String situacaoCodigo) {
		this.situacaoCodigo = situacaoCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	@Override
	public String toString() {
		return "Situacoes [situacoesId=" + situacoesId + ", situacaoCodigo=" + situacaoCodigo + ", projetoId="
				+ projetoId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projetoId == null) ? 0 : projetoId.hashCode());
		result = prime * result + ((situacaoCodigo == null) ? 0 : situacaoCodigo.hashCode());
		result = prime * result + ((situacoesId == null) ? 0 : situacoesId.hashCode());
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
		SituacaoProjeto other = (SituacaoProjeto) obj;
		if (projetoId == null) {
			if (other.projetoId != null)
				return false;
		} else if (!projetoId.equals(other.projetoId))
			return false;
		if (situacaoCodigo == null) {
			if (other.situacaoCodigo != null)
				return false;
		} else if (!situacaoCodigo.equals(other.situacaoCodigo))
			return false;
		if (situacoesId == null) {
			if (other.situacoesId != null)
				return false;
		} else if (!situacoesId.equals(other.situacoesId))
			return false;
		return true;
	}

}