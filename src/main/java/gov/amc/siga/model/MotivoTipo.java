package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class MotivoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long motivoTipoId;
	private String motivoCodigo;
	private String motivoDescricao;

	public MotivoTipo() {
	}

	public MotivoTipo(Long motivoTipoId, String motivoCodigo, String motivoDescricao) {
		super();
		this.motivoTipoId = motivoTipoId;
		this.motivoCodigo = motivoCodigo;
		this.motivoDescricao = motivoDescricao;
	}

	public Long getMotivoTipoId() {
		return motivoTipoId;
	}

	public void setMotivoTipoId(Long motivoTipoId) {
		this.motivoTipoId = motivoTipoId;
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
	public String toString() {
		return "MotivoTipo [motivoTipoId=" + motivoTipoId + ", motivoCodigo=" + motivoCodigo + ", motivoDescricao="
				+ motivoDescricao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((motivoCodigo == null) ? 0 : motivoCodigo.hashCode());
		result = prime * result + ((motivoDescricao == null) ? 0 : motivoDescricao.hashCode());
		result = prime * result + ((motivoTipoId == null) ? 0 : motivoTipoId.hashCode());
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
		if (motivoTipoId == null) {
			if (other.motivoTipoId != null)
				return false;
		} else if (!motivoTipoId.equals(other.motivoTipoId))
			return false;
		return true;
	}

}