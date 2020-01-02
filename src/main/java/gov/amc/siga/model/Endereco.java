package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Endereco implements Comparable<Classificacao>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Longradouro longradouro;
	private Longradouro longradouroCruzamento;
	private Longradouro longradouroTrecho;
	private String regional;
	private String divisao;
	private Bairro bairro;
	private Projeto projeto;
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Endereco(Longradouro longradouro, Longradouro longradouroCruzamento, Longradouro longradouroTrecho,
			String regional, String divisao, Bairro bairro, Projeto projeto) {
		super();
		this.longradouro = longradouro;
		this.longradouroCruzamento = longradouroCruzamento;
		this.longradouroTrecho = longradouroTrecho;
		this.regional = regional;
		this.divisao = divisao;
		this.bairro = bairro;
		this.projeto = projeto;
	}
	

	public Longradouro getLongradouro() {
		return longradouro;
	}


	public Longradouro getLongradouroCruzamento() {
		return longradouroCruzamento;
	}


	public Longradouro getLongradouroTrecho() {
		return longradouroTrecho;
	}


	public String getRegional() {
		return regional;
	}


	public String getDivisao() {
		return divisao;
	}


	public Bairro getBairro() {
		return bairro;
	}


	public Projeto getProjeto() {
		return projeto;
	}


	public void setLongradouro(Longradouro longradouro) {
		this.longradouro = longradouro;
	}


	public void setLongradouroCruzamento(Longradouro longradouroCruzamento) {
		this.longradouroCruzamento = longradouroCruzamento;
	}


	public void setLongradouroTrecho(Longradouro longradouroTrecho) {
		this.longradouroTrecho = longradouroTrecho;
	}


	public void setRegional(String regional) {
		this.regional = regional;
	}


	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}


	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}


	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}


	@Override
	public int compareTo(Classificacao o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
