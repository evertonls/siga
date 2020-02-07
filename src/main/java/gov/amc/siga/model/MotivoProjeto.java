package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class MotivoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private MotivoTipo motivoTipo;

	public MotivoProjeto() {
	}

	public MotivoProjeto(Long projetoId, MotivoTipo motivoTipo) {
		super();
		this.projetoId = projetoId;
		this.motivoTipo = motivoTipo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public MotivoTipo getMotivoTipo() {
		return motivoTipo;
	}

	public void setMotivoTipo(MotivoTipo motivoTipo) {
		this.motivoTipo = motivoTipo;
	}

}
