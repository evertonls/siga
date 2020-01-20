package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class MotivoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String motivoCodigo;
	private String motivoDescricao;

	public MotivoTipo() {
	}

	public MotivoTipo(String motivoCodigo, String motivoDescricao) {
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
	
	

	
}