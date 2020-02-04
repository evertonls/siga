package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class IntervencaoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String intervencaoCodigo;
	private Long projetoId;
	private Integer quantidade;

	public IntervencaoProjeto() {
	}

	public IntervencaoProjeto(Long intervencoesId, String intervencaoCodigo, Long projetoId, Integer quantidade) {
		super();
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

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((intervencaoCodigo == null) ? 0 : intervencaoCodigo.hashCode());
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
		IntervencaoProjeto other = (IntervencaoProjeto) obj;
		if (intervencaoCodigo == null) {
			if (other.intervencaoCodigo != null)
				return false;
		} else if (!intervencaoCodigo.equals(other.intervencaoCodigo))
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
