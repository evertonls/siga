package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class AparelhoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String aparelhoCodigo;
	private String aparelhoDescricao;

	public AparelhoTipo() {
	}

	public AparelhoTipo(String aparelhoCodigo, String aparelhoDescricao) {
		super();
		this.aparelhoCodigo = aparelhoCodigo;
		this.aparelhoDescricao = aparelhoDescricao;
	}

	public String getAparelhoCodigo() {
		return aparelhoCodigo;
	}

	public void setAparelhoCodigo(String aparelhoCodigo) {
		this.aparelhoCodigo = aparelhoCodigo;
	}

	public String getAparelhoDescricao() {
		return aparelhoDescricao;
	}

	public void setAparelhoDescricao(String aparelhoDescricao) {
		this.aparelhoDescricao = aparelhoDescricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aparelhoCodigo == null) ? 0 : aparelhoCodigo.hashCode());
		result = prime * result + ((aparelhoDescricao == null) ? 0 : aparelhoDescricao.hashCode());
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
		AparelhoTipo other = (AparelhoTipo) obj;
		if (aparelhoCodigo == null) {
			if (other.aparelhoCodigo != null)
				return false;
		} else if (!aparelhoCodigo.equals(other.aparelhoCodigo))
			return false;
		if (aparelhoDescricao == null) {
			if (other.aparelhoDescricao != null)
				return false;
		} else if (!aparelhoDescricao.equals(other.aparelhoDescricao))
			return false;
		return true;
	}

}
