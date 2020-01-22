package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Longradouro implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String Longradouro;
	private String tipo;
	private String titulo;
	private String jurisdicao;
	

	public Longradouro() {
	}


	public Longradouro(long id, String longradouro, String tipo, String titulo, String jurisdicao) {
		super();
		this.id = id;
		Longradouro = longradouro;
		this.tipo = tipo;
		this.titulo = titulo;
		this.jurisdicao = jurisdicao;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getId() {
		return id;
	}

	public String getLongradouro() {
		return Longradouro;
	}

	public String getTipo() {
		return tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getJurisdicao() {
		return jurisdicao;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLongradouro(String longradouro) {
		Longradouro = longradouro;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setJurisdicao(String jurisdicao) {
		this.jurisdicao = jurisdicao;
	}
}
