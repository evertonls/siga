package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class MotivoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String motivoCodigo;
	private String motivoDescricao;

	public MotivoTipo() {
	}

	public MotivoTipo(Long motivoTipoId, String motivoCodigo, String motivoDescricao) {
		super();
		this.motivoCodigo = motivoCodigo;
		this.motivoDescricao = motivoDescricao;
	}

	public String getMotivoCodigo() {
		return motivoCodigo;
	}

	public void setMotivoCodigo(String motivoCodigo) {
		this.motivoCodigo = motivoCodigo;
	}

	public String getMotivoDescricao() {
		return motivoDescricao;
	}

	public void setMotivoDescricao(String motivoDescricao) {
		this.motivoDescricao = motivoDescricao;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((motivoCodigo == null) ? 0 : motivoCodigo.hashCode());
		result = prime * result + ((motivoDescricao == null) ? 0 : motivoDescricao.hashCode());
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
		MotivoTipo other = (MotivoTipo) obj;
		if (motivoCodigo == null) {
			if (other.motivoCodigo != null)
				return false;
		} else if (!motivoCodigo.equals(other.motivoCodigo))
			return false;
		if (motivoDescricao == null) {
			if (other.motivoDescricao != null)
				return false;
		} else if (!motivoDescricao.equals(other.motivoDescricao))
			return false;
		return true;
	}

}