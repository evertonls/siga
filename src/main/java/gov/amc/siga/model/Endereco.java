package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long enderecoId;
	private Bairro bairro;
	private Projeto projeto;
	private String regional;
	private String divisao;

	public Endereco() {
	}
	
	

	public Endereco(Long enderecoId, Bairro bairro, Projeto projeto, String regional, String divisao) {
		super();
		this.enderecoId = enderecoId;
		this.bairro = bairro;
		this.projeto = projeto;
		this.regional = regional;
		this.divisao = divisao;
	}



	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public Long getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(Long enderecoId) {
		this.enderecoId = enderecoId;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	
	public String getDivisao() {
		return divisao;
	}

	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(enderecoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Endereco))
			return false;

		Endereco e = (Endereco) obj;

		return Objects.equals(enderecoId, e.getEnderecoId());
	}

}
