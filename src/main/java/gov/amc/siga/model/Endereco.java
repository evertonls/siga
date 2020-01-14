package gov.amc.siga.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Longradouro longradouro;
	private String regional;
	private String divisao;
	private Bairro bairro;
	private Projeto projeto;

	private List<Bairro> bairros;
	private List<Longradouro> longradouros;

	public Endereco() {
	}

	public Endereco(Longradouro longradouro, String regional, String divisao, Bairro bairro, Projeto projeto,
			List<Bairro> bairros, List<Longradouro> longradouros) {
		super();
		this.longradouro = longradouro;
		this.regional = regional;
		this.divisao = divisao;
		this.bairro = bairro;
		this.projeto = projeto;
		this.bairros = bairros;
		this.longradouros = longradouros;
	}

	public Longradouro getLongradouro() {
		return longradouro;
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

	public List<Bairro> getBairros() {
		return bairros;
	}

	public List<Longradouro> getLongradouros() {
		return longradouros;
	}

	public void setLongradouro(Longradouro longradouro) {
		this.longradouro = longradouro;
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

	public void setBairros(List<Bairro> bairros) {
		this.bairros = bairros;
	}

	public void setLongradouros(List<Longradouro> longradouros) {
		this.longradouros = longradouros;
	}
	
}
