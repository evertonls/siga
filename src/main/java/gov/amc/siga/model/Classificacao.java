package gov.amc.siga.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Classificacao implements Comparable<Classificacao>, Serializable {

	private static final long serialVersionUID = 1L;

	private String code;
	private String descricao;
	private List<Classificacao> classificacoes;

	public Classificacao() {
	}

	public Classificacao(String code, String especificacoes) {
		super();
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

	@Override
	public int compareTo(Classificacao o) {
		/*
		 * implementar usando colator
		 */
		return 0;
	}

	public List<Classificacao> getClassificacoes() {
		return classificacoes;
	}

	public void setClassificacoes(List<Classificacao> classificacoes) {
		this.classificacoes = classificacoes;
	}

	/*
	 * Falta implementar mais um metodo
	 * 
	 */

}