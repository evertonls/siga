package gov.amc.siga.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Bairro implements Comparable<Aparelho>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	@Override
	public int compareTo(Aparelho o) {
		return 0;
	}

	public List<Bairro> getBairros() {
		return bairros;
	}

	public void setBairros(List<Bairro> bairros) {
		this.bairros = bairros;
	}
	
	
}
