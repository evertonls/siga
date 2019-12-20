package gov.amc.siga.models;

import java.io.Serializable;

public class Descricao implements Comparable<Descricao>, Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String code;
	private String especificacao;

	public Descricao() {

	}

	public Descricao(String code, String especificacao) {
		this.code = code;
		this.especificacao = especificacao;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	@Override
	public int compareTo(Descricao arg0) {
		return 0;
	}

}