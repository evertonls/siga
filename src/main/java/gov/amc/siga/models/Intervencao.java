package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Intervencao implements Serializable {

	private static final long serialVersionUID = 1L;
	private String code;
	private String descricao;

	public Intervencao() {

	}

	public Intervencao(String code, String especificacao) {
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