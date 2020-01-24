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

	
	
}
