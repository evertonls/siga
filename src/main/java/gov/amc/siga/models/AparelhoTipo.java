package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class AparelhoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String aparelhoCodigo;
	private String aparelhoDescricao;

	public AparelhoTipo() { 	}

	public AparelhoTipo(String aparelhoCodigo, String aparelhoDescricao) {
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
	
	

	
	
}
