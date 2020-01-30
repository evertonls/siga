package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class SituacaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String situacaoCodigo;
	private String situacaoDescricao;

	public SituacaoTipo() {
	}

	public SituacaoTipo(String situacaoCodigo, String situacaoDescricao) {
		this.situacaoCodigo = situacaoCodigo;
		this.situacaoDescricao = situacaoDescricao;
	}

	public String getSituacaoCodigo() {
		return situacaoCodigo;
	}

	public void setSituacaoCodigo(String situacaoCodigo) {
		this.situacaoCodigo = situacaoCodigo;
	}

	public String getSituacaoDescricao() {
		return situacaoDescricao;
	}

	public void setSituacaoDescricao(String situacaoDescricao) {
		this.situacaoDescricao = situacaoDescricao;
	}

	@Override
	public String toString() {
		return "Código: " + situacaoCodigo + ", Descricao: " + situacaoDescricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((situacaoCodigo == null) ? 0 : situacaoCodigo.hashCode());
		result = prime * result + ((situacaoDescricao == null) ? 0 : situacaoDescricao.hashCode());
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
		SituacaoTipo other = (SituacaoTipo) obj;
		if (situacaoCodigo == null) {
			if (other.situacaoCodigo != null)
				return false;
		} else if (!situacaoCodigo.equals(other.situacaoCodigo))
			return false;
		if (situacaoDescricao == null) {
			if (other.situacaoDescricao != null)
				return false;
		} else if (!situacaoDescricao.equals(other.situacaoDescricao))
			return false;
		return true;
	}

	
}