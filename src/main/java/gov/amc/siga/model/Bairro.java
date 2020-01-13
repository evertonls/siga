package gov.amc.siga.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Bairro{

	private long id;
	private String bairro;
	private List<Bairro> bairros;

	public Bairro() {
	}

	public Bairro(long id, String bairro) {
		super();
		this.id = id;
		this.bairro = bairro;
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

	public List<Bairro> getBairros() {
		return bairros;
	}

	public void setBairros(List<Bairro> bairros) {
		this.bairros = bairros;
	}

}
