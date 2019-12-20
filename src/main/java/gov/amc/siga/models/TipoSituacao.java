package gov.amc.siga.models;

import java.io.Serializable;

public class TipoSituacao implements Comparable<TipoSituacao>, Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String code;
	private String especificacao;

	public TipoSituacao() {

	}

	public TipoSituacao(String code, String especificacao) {
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
	public int compareTo(TipoSituacao arg0) {
		return 0;
	}

}