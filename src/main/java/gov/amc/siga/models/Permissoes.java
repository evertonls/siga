package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Permissoes implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long usuarioId;
	private String autorizaCod;

	public Permissoes() {
	}

	public Permissoes(Long usuarioId, String autorizaCod) {
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

}
