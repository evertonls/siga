package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

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
