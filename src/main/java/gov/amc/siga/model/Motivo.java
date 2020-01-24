package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Motivo implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private String motivoCodigo;
	
	public Motivo() {
	}

	public Motivo(Long projetoId, String motivoCodigo) {
		super();
		this.projetoId = projetoId;
		this.motivoCodigo = motivoCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public String getMotivoCodigo() {
		return motivoCodigo;
	}

	public void setMotivoCodigo(String motivoCodigo) {
		this.motivoCodigo = motivoCodigo;
	}
	
	
}
