package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class TipoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long projetoTipificacoesId;
	private String projetoTipoCodigo;
	private Long projetoId;

	public TipoProjeto() {
	}

	public TipoProjeto(Long projetoTipificacoesId, String projetoTipoCodigo, Long projetoId) {
		super();
		this.projetoTipificacoesId = projetoTipificacoesId;
		this.projetoTipoCodigo = projetoTipoCodigo;
		this.projetoId = projetoId;
	}

	public Long getProjetoTipificacoesId() {
		return projetoTipificacoesId;
	}

	public void setProjetoTipificacoesId(Long projetoTipificacoesId) {
		this.projetoTipificacoesId = projetoTipificacoesId;
	}

	public String getProjetoTipoCodigo() {
		return projetoTipoCodigo;
	}

	public void setProjetoTipoCodigo(String projetoTipoCodigo) {
		this.projetoTipoCodigo = projetoTipoCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	@Override
	public String toString() {
		return "ProjetoTipificacoes [projetoTipificacoesId=" + projetoTipificacoesId + ", projetoTipoCodigo="
				+ projetoTipoCodigo + ", projetoId=" + projetoId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projetoId == null) ? 0 : projetoId.hashCode());
		result = prime * result + ((projetoTipificacoesId == null) ? 0 : projetoTipificacoesId.hashCode());
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
		TipoProjeto other = (TipoProjeto) obj;
		if (projetoId == null) {
			if (other.projetoId != null)
				return false;
		} else if (!projetoId.equals(other.projetoId))
			return false;
		if (projetoTipificacoesId == null) {
			if (other.projetoTipificacoesId != null)
				return false;
		} else if (!projetoTipificacoesId.equals(other.projetoTipificacoesId))
			return false;
		if (projetoTipoCodigo == null) {
			if (other.projetoTipoCodigo != null)
				return false;
		} else if (!projetoTipoCodigo.equals(other.projetoTipoCodigo))
			return false;
		return true;
	}

}
