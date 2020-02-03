package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ClassificacaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long classificacaoTipoId;
	private String classificacaoCodigo;
	private String classificacaoDescricao;

	public ClassificacaoTipo() {
	}

	public ClassificacaoTipo(Long classificacaoTipoId, String classificacaoCodigo, String classificacaoDescricao) {
		super();
		this.classificacaoTipoId = classificacaoTipoId;
		this.classificacaoCodigo = classificacaoCodigo;
		this.classificacaoDescricao = classificacaoDescricao;
	}

	public Long getClassificacaoTipoId() {
		return classificacaoTipoId;
	}

	public void setClassificacaoTipoId(Long classificacaoTipoId) {
		this.classificacaoTipoId = classificacaoTipoId;
	}

	public String getClassificacaoCodigo() {
		return classificacaoCodigo;
	}

	public void setClassificacaoCodigo(String classificacaoCodigo) {
		this.classificacaoCodigo = classificacaoCodigo;
	}

	public String getClassificacaoDescricao() {
		return classificacaoDescricao;
	}

	public void setClassificacaoDescricao(String classificacaoDescricao) {
		this.classificacaoDescricao = classificacaoDescricao;
	}

	@Override
	public String toString() {
		return "ClassificacaoTipo [classificacaoTipoId=" + classificacaoTipoId + ", classificacaoCodigo="
				+ classificacaoCodigo + ", classificacaoDescricao=" + classificacaoDescricao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classificacaoCodigo == null) ? 0 : classificacaoCodigo.hashCode());
		result = prime * result + ((classificacaoDescricao == null) ? 0 : classificacaoDescricao.hashCode());
		result = prime * result + ((classificacaoTipoId == null) ? 0 : classificacaoTipoId.hashCode());
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
		ClassificacaoTipo other = (ClassificacaoTipo) obj;
		if (classificacaoCodigo == null) {
			if (other.classificacaoCodigo != null)
				return false;
		} else if (!classificacaoCodigo.equals(other.classificacaoCodigo))
			return false;
		if (classificacaoDescricao == null) {
			if (other.classificacaoDescricao != null)
				return false;
		} else if (!classificacaoDescricao.equals(other.classificacaoDescricao))
			return false;
		if (classificacaoTipoId == null) {
			if (other.classificacaoTipoId != null)
				return false;
		} else if (!classificacaoTipoId.equals(other.classificacaoTipoId))
			return false;
		return true;
	}

	

}