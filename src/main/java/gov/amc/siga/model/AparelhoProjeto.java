package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class AparelhoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private AparelhoTipo aparelhoTipo;
	private Double quantidade;

	public AparelhoProjeto() {
	}

	public AparelhoProjeto(Long projetoId, AparelhoTipo aparelhoTipo, Double quantidade) {
		super();
		this.projetoId = projetoId;
		this.aparelhoTipo = aparelhoTipo;
		this.quantidade = quantidade;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public AparelhoTipo getAparelhoTipo() {
		return aparelhoTipo;
	}

	public void setAparelhoTipo(AparelhoTipo aparelhoTipo) {
		this.aparelhoTipo = aparelhoTipo;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

}