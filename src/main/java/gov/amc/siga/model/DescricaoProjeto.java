package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class DescricaoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String descricaoCodigo;
	private Long projetoId;

	public DescricaoProjeto() {
	}

	public DescricaoProjeto(Long descricoesId, String descricaoCodigo, Long projetoId) {
		super();
		this.descricaoCodigo = descricaoCodigo;
		this.projetoId = projetoId;
	}

	public String getDescricaoCodigo() {
		return descricaoCodigo;
	}

	public void setDescricaoCodigo(String descricaoCodigo) {
		this.descricaoCodigo = descricaoCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricaoCodigo == null) ? 0 : descricaoCodigo.hashCode());
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
		DescricaoProjeto other = (DescricaoProjeto) obj;
		if (descricaoCodigo == null) {
			if (other.descricaoCodigo != null)
				return false;
		} else if (!descricaoCodigo.equals(other.descricaoCodigo))
			return false;
		if (projetoId == null) {
			if (other.projetoId != null)
				return false;
		} else if (!projetoId.equals(other.projetoId))
			return false;
		return true;
	}
}
