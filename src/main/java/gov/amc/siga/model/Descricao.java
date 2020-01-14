package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Descricao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String code;
	private String descricao;

	public Descricao() {

	}

	public Descricao(String code, String especificacao) {
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