package gov.amc.siga.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Descricao implements Comparable<Descricao>, Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String code;
	private String descricao;
	private List<Descricao> descricoes;

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

	@Override
	public int compareTo(Descricao arg0) {
		return 0;
	}

	public List<Descricao> getDescricoes() {
		return descricoes;
	}

	public void setDescricoes(List<Descricao> descricoes) {
		this.descricoes = descricoes;
	}

}