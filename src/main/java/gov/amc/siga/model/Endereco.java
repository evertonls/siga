package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long enderecoId;
	private Long longradouro;
	private Long cruzamento;
	private Long trecho;
	private String regional;
	private String divisao;
	private Long bairroId;
	private Long projetoId;

	public Endereco() {
	}

	public Endereco(Long enderecoId, Long longradouro, Long cruzamento, Long trecho, String regional, String divisao,
			Long bairroId, Long projetoId) {
		super();
		this.enderecoId = enderecoId;
		this.longradouro = longradouro;
		this.cruzamento = cruzamento;
		this.trecho = trecho;
		this.regional = regional;
		this.divisao = divisao;
		this.bairroId = bairroId;
		this.projetoId = projetoId;
	}

	public Long getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(Long enderecoId) {
		this.enderecoId = enderecoId;
	}

	public Long getLongradouro() {
		return longradouro;
	}

	public void setLongradouro(Long longradouro) {
		this.longradouro = longradouro;
	}

	public Long getCruzamento() {
		return cruzamento;
	}

	public void setCruzamento(Long cruzamento) {
		this.cruzamento = cruzamento;
	}

	public Long getTrecho() {
		return trecho;
	}

	public void setTrecho(Long trecho) {
		this.trecho = trecho;
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

	public Long getBairroId() {
		return bairroId;
	}

	public void setBairroId(Long bairroId) {
		this.bairroId = bairroId;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
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
