package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Longradouro longradouro;
	private String regional;
	private String divisao;
	private Bairro bairro;
	private Projeto projeto;

	public Endereco() { 	}

	public Endereco(Longradouro longradouro, String regional, String divisao, Bairro bairro, Projeto projeto) {
		this.longradouro = longradouro;
		this.regional = regional;
		this.divisao = divisao;
		this.bairro = bairro;
		this.projeto = projeto;
	}

	public Longradouro getLongradouro() {
		return longradouro;
	}

	public void setLongradouro(Object object) {
		this.longradouro = (Longradouro) object;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public String getDivisao() {
		return divisao;
	}

	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Object object) {
		this.bairro = (Bairro) object;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Object object) {
		this.projeto = (Projeto) object;
	}
	
}
