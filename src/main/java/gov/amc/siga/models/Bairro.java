package gov.amc.siga.models;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Bairro implements Serializable{

	private static final long serialVersionUID = 1L;
	private long id;
	private String bairro;
	private List<Longradouro> longradouros;

	public Bairro() {
	}

	public Bairro(long id, String bairro) {
		this.id = id;
		this.bairro = bairro;
	}
	
	public Bairro(long id, String bairro, List<Longradouro> longradouros) {
		this.id = id;
		this.bairro = bairro;
		this.longradouros = longradouros;
	}

	public long getId() {
		return id;
	}

	public String getBairro() {
		return bairro;
	}

	public void setId(long id) {
		this.id = id;
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
