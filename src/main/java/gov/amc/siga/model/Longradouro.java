package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Longradouro implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long longradouroId;
	private String longradouro;
	private String tipo;
	private String titulo;
	private String jurisdicao;

	public Longradouro() {
	}

	public Longradouro(Long longradouroId, String longradouro, String tipo, String titulo, String jurisdicao) {
		super();
		this.longradouroId = longradouroId;
		this.longradouro = longradouro;
		this.tipo = tipo;
		this.titulo = titulo;
		this.jurisdicao = jurisdicao;
	}

	public Long getLongradouroId() {
		return longradouroId;
	}

	public void setLongradouroId(Long longradouroId) {
		this.longradouroId = longradouroId;
	}

	public String getLongradouro() {
		return longradouro;
	}

	public void setLongradouro(String longradouro) {
		this.longradouro = longradouro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getJurisdicao() {
		return jurisdicao;
	}

	public void setJurisdicao(String jurisdicao) {
		this.jurisdicao = jurisdicao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(longradouroId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Longradouro))
			return false;

		Longradouro l = (Longradouro) obj;

		return Objects.equals(longradouroId, l.getLongradouroId());
	}

}
