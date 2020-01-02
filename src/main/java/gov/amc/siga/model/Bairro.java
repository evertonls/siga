package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Bairro implements Comparable<Aparelho>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String bairro;
	
	public Bairro() {
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
