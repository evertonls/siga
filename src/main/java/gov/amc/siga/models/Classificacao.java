package gov.amc.siga.models;

import java.io.Serializable;

public class Classificacao implements Comparable<Classificacao>, Serializable {

	private static final long serialVersionUID = 1L;

	private String code;
	private String especificacoes;

	public Classificacao() {
	}

	public Classificacao(String code, String especificacoes) {
		super();
		this.code = code;
		this.especificacoes = especificacoes;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(String especificacoes) {
		this.especificacoes = especificacoes;
	}

	@Override
	public int compareTo(Classificacao o) {
		// TODO Auto-generated method stub
		/*
		 * implementar usando colator
		 */
		return 0;
	}

	/*
	 * Falta implementar mais um metodo
	 * 
	 */

}