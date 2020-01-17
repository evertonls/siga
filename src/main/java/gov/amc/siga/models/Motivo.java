package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Motivo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String code;
	private String descricao;

	public Motivo() {

	}

	public Motivo(String code, String especificacao) {
		super();
		this.code = code;
		this.descricao = especificacao;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEspecificacao() {
		return descricao;
	}

	public void setEspecificacao(String especificacao) {
		this.descricao = especificacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}