package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class SituacaoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private SituacaoTipo situacaoTipo;

	public SituacaoProjeto() {
	}

	public SituacaoProjeto(Long projetoId, SituacaoTipo situacaoTipo) {
		super();
		this.projetoId = projetoId;
		this.situacaoTipo = situacaoTipo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public SituacaoTipo getSituacaoTipo() {
		return situacaoTipo;
	}

	public void setSituacaoTipo(SituacaoTipo situacaoTipo) {
		this.situacaoTipo = situacaoTipo;
	}

}
