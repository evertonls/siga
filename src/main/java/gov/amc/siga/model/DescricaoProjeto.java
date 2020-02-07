package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class DescricaoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private DescricaoTipo descricaoTipo;

	public DescricaoProjeto() {
	}

	public DescricaoProjeto(Long projetoId, DescricaoTipo descricaoTipo) {
		super();
		this.projetoId = projetoId;
		this.descricaoTipo = descricaoTipo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public DescricaoTipo getDescricaoTipo() {
		return descricaoTipo;
	}

	public void setDescricaoTipo(DescricaoTipo descricaoTipo) {
		this.descricaoTipo = descricaoTipo;
	}

	
	
}