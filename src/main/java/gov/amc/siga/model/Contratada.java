package gov.amc.siga.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Contratada implements Comparable<Contratada>, Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String code;
	private String descricao;
	private List<Contratada> contratadas;

	public Contratada() {

	}

	public Contratada(String code, String especificacao) {
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

	@Override
	public int compareTo(Contratada o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Contratada> getContratadas() {
		return contratadas;
	}

	public void setContratadas(List<Contratada> contratadas) {
		this.contratadas = contratadas;
	}

}
