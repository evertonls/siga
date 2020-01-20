package gov.amc.siga.models;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Bairro implements Serializable{

	private static final long serialVersionUID = 1L;
	private long bairroId;
	private String bairro;
	private List<Longradouro> longradouros;

	public Bairro() {
	}

	public Bairro(long bairroId, String bairro) {
		this.bairroId = bairroId;
		this.bairro = bairro;
	}
	
	public Bairro(long bairroId, String bairro, List<Longradouro> longradouros) {
		this.bairroId = bairroId;
		this.bairro = bairro;
		this.longradouros = longradouros;
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

	public List<Longradouro> getLongradouros() {
		return longradouros;
	}

	public void setLongradouros(List<Longradouro> longradouros) {
		this.longradouros = longradouros;
	}
	
	
}
