package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ProjetoTipo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String projetoTipoCodigo;
	private String projetoTipoDescricao;

	public ProjetoTipo() {
	}

	public ProjetoTipo(String projetoTipoCodigo, String projetoTipoDescricao) {
		this.projetoTipoCodigo = projetoTipoCodigo;
		this.projetoTipoDescricao = projetoTipoDescricao;
	}

	public String getProjetoTipoCodigo() {
		return projetoTipoCodigo;
	}

	public void setProjetoTipoCodigo(String projetoTipoCodigo) {
		this.projetoTipoCodigo = projetoTipoCodigo;
	}

	public String getProjetoTipoDescricao() {
		return projetoTipoDescricao;
	}

	public void setProjetoTipoDescricao(String projetoTipoDescricao) {
		this.projetoTipoDescricao = projetoTipoDescricao;
	}

	@Override
	public String toString() {
		return "ProjetoTipo [projetoTipoCodigo=" + projetoTipoCodigo + ", projetoTipoDescricao=" + projetoTipoDescricao
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projetoTipoCodigo == null) ? 0 : projetoTipoCodigo.hashCode());
		result = prime * result + ((projetoTipoDescricao == null) ? 0 : projetoTipoDescricao.hashCode());
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
		ProjetoTipo other = (ProjetoTipo) obj;
		if (projetoTipoCodigo == null) {
			if (other.projetoTipoCodigo != null)
				return false;
		} else if (!projetoTipoCodigo.equals(other.projetoTipoCodigo))
			return false;
		if (projetoTipoDescricao == null) {
			if (other.projetoTipoDescricao != null)
				return false;
		} else if (!projetoTipoDescricao.equals(other.projetoTipoDescricao))
			return false;
		return true;
	}

	
}
