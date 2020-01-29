package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Bairro implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long bairroId;
	private String bairro;

	public Bairro() {
	}

	public Bairro(Long bairroId, String bairro) {
		super();
		this.bairroId = bairroId;
		this.bairro = bairro;
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

	@Override
	public String toString() {
		return "id: " + bairroId + ", bairro: " + bairro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((bairroId == null) ? 0 : bairroId.hashCode());
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
		return true;
	}

}
