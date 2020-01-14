package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Contratada implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String code;
	private String descricao;

	public Contratada() {

	}

	public Contratada(String code, String especificacao) {
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
}
