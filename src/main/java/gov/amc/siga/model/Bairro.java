package gov.amc.siga.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Bairro implements Serializable{

	private static final long serialVersionUID = 1L;
	private long bairroId;
	private String bairro;

	public Bairro() {
	}

	public Bairro(long bairroId, String bairro) {
		this.bairroId = bairroId;
		this.bairro = bairro;
	}
	
	public Bairro(long bairroId, String bairro, List<Longradouro> longradouros) {
		this.bairroId = bairroId;
		this.bairro = bairro;
	}

	public long getBairroId() {
		return bairroId;
	}

	public String getBairro() {
		return bairro;
	}

	public void setbairroId(long bairroId) {
		this.bairroId = bairroId;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	

	@Override
	public String toString() {
		return "Bairro [bairroId=" + bairroId + ", bairro=" + bairro + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + (int) (bairroId ^ (bairroId >>> 32));
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
		if (bairroId != other.bairroId)
			return false;
		return true;
	}

	
	
	
}
