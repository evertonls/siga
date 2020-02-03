package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class DescricaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long descricaoId;
	private String descricaoCodigo;
	private String descricaoDescricao;

	public DescricaoTipo() {
	}

	public DescricaoTipo(Long descricaoId, String descricaoCodigo, String descricaoDescricao) {
		super();
		this.descricaoId = descricaoId;
		this.descricaoCodigo = descricaoCodigo;
		this.descricaoDescricao = descricaoDescricao;
	}

	public Long getDescricaoId() {
		return descricaoId;
	}

	public void setDescricaoId(Long descricaoId) {
		this.descricaoId = descricaoId;
	}

	public String getDescricaoCodigo() {
		return descricaoCodigo;
	}

	public void setDescricaoCodigo(String descricaoCodigo) {
		this.descricaoCodigo = descricaoCodigo;
	}

	public String getDescricaoDescricao() {
		return descricaoDescricao;
	}

	public void setDescricaoDescricao(String descricaoDescricao) {
		this.descricaoDescricao = descricaoDescricao;
	}

	@Override
	public String toString() {
		return "DescricaoTipo [descricaoId=" + descricaoId + ", descricaoCodigo=" + descricaoCodigo
				+ ", descricaoDescricao=" + descricaoDescricao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricaoCodigo == null) ? 0 : descricaoCodigo.hashCode());
		result = prime * result + ((descricaoDescricao == null) ? 0 : descricaoDescricao.hashCode());
		result = prime * result + ((descricaoId == null) ? 0 : descricaoId.hashCode());
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
		DescricaoTipo other = (DescricaoTipo) obj;
		if (descricaoCodigo == null) {
			if (other.descricaoCodigo != null)
				return false;
		} else if (!descricaoCodigo.equals(other.descricaoCodigo))
			return false;
		if (descricaoDescricao == null) {
			if (other.descricaoDescricao != null)
				return false;
		} else if (!descricaoDescricao.equals(other.descricaoDescricao))
			return false;
		if (descricaoId == null) {
			if (other.descricaoId != null)
				return false;
		} else if (!descricaoId.equals(other.descricaoId))
			return false;
		return true;
	}

	

	
}