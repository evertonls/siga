package gov.amc.siga.models;

import java.io.Serializable;

public class TProjeto implements Comparable<TProjeto>, Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String code;
	private String especificacao;

	public TProjeto() {

	}

	public TProjeto(String code, String especificacao) {
		super();
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
	public int compareTo(TProjeto arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
