package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class TipoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private ProjetoTipo projetoTipo;

	public TipoProjeto() {
	}

	public TipoProjeto(Long projetoId, ProjetoTipo projetoTipo) {
		super();
		this.projetoId = projetoId;
		this.projetoTipo = projetoTipo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public ProjetoTipo getProjetoTipo() {
		return projetoTipo;
	}

	public void setProjetoTipo(ProjetoTipo projetoTipo) {
		this.projetoTipo = projetoTipo;
	}

}
