package gov.amc.siga.model;

import java.io.Serializable;

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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((bairroId == null) ? 0 : bairroId.hashCode());
		result = prime * result + ((cruzamento == null) ? 0 : cruzamento.hashCode());
		result = prime * result + ((longradouro == null) ? 0 : longradouro.hashCode());
		result = prime * result + ((trecho == null) ? 0 : trecho.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bairro other = (Bairro) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (bairroId == null) {
			if (other.bairroId != null)
				return false;
		} else if (!bairroId.equals(other.bairroId))
			return false;
		if (cruzamento == null) {
			if (other.cruzamento != null)
				return false;
		} else if (!cruzamento.equals(other.cruzamento))
			return false;
		if (longradouro == null) {
			if (other.longradouro != null)
				return false;
		} else if (!longradouro.equals(other.longradouro))
			return false;
		if (trecho == null) {
			if (other.trecho != null)
				return false;
		} else if (!trecho.equals(other.trecho))
			return false;
		return true;
	}

}
