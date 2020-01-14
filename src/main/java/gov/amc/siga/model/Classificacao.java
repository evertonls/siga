package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Classificacao implements Serializable {

	private static final long serialVersionUID = 1L;

	private String code;
	private String descricao;

	public Classificacao() {
	}

	public Classificacao(String code, String especificacoes) {
		this.code = code;
		this.descricao = especificacoes;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEspecificacoes() {
		return descricao;
	}

	public void setEspecificacoes(String especificacoes) {
		this.descricao = especificacoes;
	}
}