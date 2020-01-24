package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Longradouro implements Serializable {

	private static final long serialVersionUID = 1L;

	private long longradouroId;
	private String longradouro;
	private String tipo;
	private String titulo;
	private String jurisdicao;

	public Longradouro() {
	}

	public Longradouro(long longradouroId, String longradouro, String tipo, String titulo, String jurisdicao) {
		this.longradouroId = longradouroId;
		this.longradouro = longradouro;
		this.tipo = tipo;
		this.titulo = titulo;
		this.jurisdicao = jurisdicao;
	}

	public long getlongradouroId() {
		return longradouroId;
	}

	public String getLongradouro() {
		return longradouro;
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

	public void setlongradouroId(long longradouroId) {
		this.longradouroId = longradouroId;
	}

	public void setLongradouro(String longradouro) {
		this.longradouro = longradouro;
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
