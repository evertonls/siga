package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Bairro implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long bairroId;
	private String bairro;
	private Longradouro longradouro;
	private Longradouro trecho;
	private Longradouro cruzamento;

	public Bairro() {
	}
	
	public Bairro(Long bairroId, String bairro) {
		this.bairroId = bairroId;
		this.bairro = bairro;
	}

	public Bairro(Long bairroId, String bairro, Longradouro longradouro, Longradouro trecho, Longradouro cruzamento) {
		super();
		this.bairroId = bairroId;
		this.bairro = bairro;
		this.longradouro = longradouro;
		this.trecho = trecho;
		this.cruzamento = cruzamento;
	}

	public Long getBairroId() {
		return bairroId;
	}

	public void setBairroId(Long bairroId) {
		this.bairroId = bairroId;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Longradouro getLongradouro() {
		return longradouro;
	}

	public void setLongradouro(Longradouro longradouro) {
		this.longradouro = longradouro;
	}

	public Longradouro getTrecho() {
		return trecho;
	}

	public void setTrecho(Longradouro trecho) {
		this.trecho = trecho;
	}

	public Longradouro getCruzamento() {
		return cruzamento;
	}

	public void setCruzamento(Longradouro cruzamento) {
		this.cruzamento = cruzamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bairro);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		if (!(obj instanceof Bairro))
			return false;

		Bairro b = (Bairro) obj;

		return Objects.equals(bairro, b.getBairro());
	}

}
