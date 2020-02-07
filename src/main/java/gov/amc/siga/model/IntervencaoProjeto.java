package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class IntervencaoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private Integer quantidade;
	private IntervencaoTipo intervencaoTipo;

	public IntervencaoProjeto() {
	}

	public IntervencaoProjeto(Long projetoId, Integer quantidade, IntervencaoTipo intervencaoTipo) {
		super();
		this.projetoId = projetoId;
		this.quantidade = quantidade;
		this.intervencaoTipo = intervencaoTipo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public IntervencaoTipo getIntervencaoTipo() {
		return intervencaoTipo;
	}

	public void setIntervencaoTipo(IntervencaoTipo intervencaoTipo) {
		this.intervencaoTipo = intervencaoTipo;
	}

}
