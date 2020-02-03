package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class IntervencaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long intervencaoTipoId;
	private String intervencaoCodigo;
	private String intervencaoDescricao;

	public IntervencaoTipo() {
	}

	public IntervencaoTipo(Long intervencaoTipoId, String intervencaoCodigo, String intervencaoDescricao) {
		super();
		this.intervencaoTipoId = intervencaoTipoId;
		this.intervencaoCodigo = intervencaoCodigo;
		this.intervencaoDescricao = intervencaoDescricao;
	}

	public Long getIntervencaoTipoId() {
		return intervencaoTipoId;
	}

	public void setIntervencaoTipoId(Long intervencaoTipoId) {
		this.intervencaoTipoId = intervencaoTipoId;
	}

	public String getIntervencaoCodigo() {
		return intervencaoCodigo;
	}

	public void setIntervencaoCodigo(String intervencaoCodigo) {
		this.intervencaoCodigo = intervencaoCodigo;
	}

	public String getIntervencaoDescricao() {
		return intervencaoDescricao;
	}

	public void setIntervencaoDescricao(String intervencaoDescricao) {
		this.intervencaoDescricao = intervencaoDescricao;
	}

	@Override
	public String toString() {
		return "IntervencaoTipo [intervencaoTipoId=" + intervencaoTipoId + ", intervencaoCodigo=" + intervencaoCodigo
				+ ", intervencaoDescricao=" + intervencaoDescricao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((intervencaoCodigo == null) ? 0 : intervencaoCodigo.hashCode());
		result = prime * result + ((intervencaoDescricao == null) ? 0 : intervencaoDescricao.hashCode());
		result = prime * result + ((intervencaoTipoId == null) ? 0 : intervencaoTipoId.hashCode());
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
		IntervencaoTipo other = (IntervencaoTipo) obj;
		if (intervencaoCodigo == null) {
			if (other.intervencaoCodigo != null)
				return false;
		} else if (!intervencaoCodigo.equals(other.intervencaoCodigo))
			return false;
		if (intervencaoDescricao == null) {
			if (other.intervencaoDescricao != null)
				return false;
		} else if (!intervencaoDescricao.equals(other.intervencaoDescricao))
			return false;
		if (intervencaoTipoId == null) {
			if (other.intervencaoTipoId != null)
				return false;
		} else if (!intervencaoTipoId.equals(other.intervencaoTipoId))
			return false;
		return true;
	}

}