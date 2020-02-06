package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Longradouro implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long longradouroId;
	private String longradouro;
	private String tipo;
	private String titulo;
	private String jurisdicao;
	private String trecho;
	private String cruzamento;

	public Longradouro() {
	}

	public Longradouro(Long longradouroId, String longradouro, String tipo, String titulo, String jurisdicao,
			String trecho, String cruzamento) {
		super();
		this.longradouroId = longradouroId;
		this.longradouro = longradouro;
		this.tipo = tipo;
		this.titulo = titulo;
		this.jurisdicao = jurisdicao;
		this.trecho = trecho;
		this.cruzamento = cruzamento;
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

	public String getTrecho() {
		return trecho;
	}

	public void setTrecho(String trecho) {
		this.trecho = trecho;
	}

	public String getCruzamento() {
		return cruzamento;
	}

	public void setCruzamento(String cruzamento) {
		this.cruzamento = cruzamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cruzamento == null) ? 0 : cruzamento.hashCode());
		result = prime * result + ((jurisdicao == null) ? 0 : jurisdicao.hashCode());
		result = prime * result + ((longradouro == null) ? 0 : longradouro.hashCode());
		result = prime * result + ((longradouroId == null) ? 0 : longradouroId.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((trecho == null) ? 0 : trecho.hashCode());
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
		if (cruzamento == null) {
			if (other.cruzamento != null)
				return false;
		} else if (!cruzamento.equals(other.cruzamento))
			return false;
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
		if (longradouroId == null) {
			if (other.longradouroId != null)
				return false;
		} else if (!longradouroId.equals(other.longradouroId))
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
		if (trecho == null) {
			if (other.trecho != null)
				return false;
		} else if (!trecho.equals(other.trecho))
			return false;
		return true;
	}

}
