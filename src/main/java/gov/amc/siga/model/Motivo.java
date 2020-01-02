package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Motivo implements Comparable<Motivo>, Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String code;
	private String especificacao;

	public Motivo() {

	}

	public Motivo(String code, String especificacao) {
		super();
		this.code = code;
		this.especificacao = especificacao;
	}

	@Override
	public int compareTo(Motivo arg0) {
		return 0;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}