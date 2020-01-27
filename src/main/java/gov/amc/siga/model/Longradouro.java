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

	@Override
	public String toString() {
		return "Longradouro [longradouroId=" + longradouroId + ", longradouro=" + longradouro + ", tipo=" + tipo
				+ ", titulo=" + titulo + ", jurisdicao=" + jurisdicao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jurisdicao == null) ? 0 : jurisdicao.hashCode());
		result = prime * result + ((longradouro == null) ? 0 : longradouro.hashCode());
		result = prime * result + (int) (longradouroId ^ (longradouroId >>> 32));
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Longradouro other = (Longradouro) obj;
		if (jurisdicao == null) {
			if (other.jurisdicao != null)
				return false;
		} else if (!jurisdicao.equals(other.jurisdicao))
			return false;
		if (longradouro == null) {
			if (other.longradouro != null)
				return false;
		} else if (!longradouro.equals(other.longradouro))
			return false;
		if (longradouroId != other.longradouroId)
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	
	
	
}
