package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Permissao implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long usuarioId;
	private String autorizaCod;

	public Permissao() {
	}

	public Permissao(Long usuarioId, String autorizaCod) {
		this.usuarioId = usuarioId;
		this.autorizaCod = autorizaCod;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getAutorizaCod() {
		return autorizaCod;
	}

	public void setAutorizaCod(String autorizaCod) {
		this.autorizaCod = autorizaCod;
	}

	@Override
	public String toString() {
		return "Permissao [usuarioId=" + usuarioId + ", autorizaCod=" + autorizaCod + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autorizaCod == null) ? 0 : autorizaCod.hashCode());
		result = prime * result + ((usuarioId == null) ? 0 : usuarioId.hashCode());
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
		Permissao other = (Permissao) obj;
		if (autorizaCod == null) {
			if (other.autorizaCod != null)
				return false;
		} else if (!autorizaCod.equals(other.autorizaCod))
			return false;
		if (usuarioId == null) {
			if (other.usuarioId != null)
				return false;
		} else if (!usuarioId.equals(other.usuarioId))
			return false;
		return true;
	}

	
}
