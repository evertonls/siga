package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

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
		return Objects.hash(aparelhoCodigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if( !(obj instanceof AparelhoTipo))
			return false;
		
		AparelhoTipo at = (AparelhoTipo) obj;
		
		return Objects.equals(aparelhoCodigo, at.getAparelhoCodigo());
		
	}

}
