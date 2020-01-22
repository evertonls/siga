package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Descricoes implements Serializable {

	private static final long serialVersionUID = 1L;
	private String descricaoCodigo;
	private Long projetoId;

	public Descricoes() {
	}

	public Descricoes(String descricaoCodigo, Long projetoId) {
		this.descricaoCodigo = descricaoCodigo;
		this.projetoId = projetoId;
	}

	public String getDescricaoCodigo() {
		return descricaoCodigo;
	}

	public void setDescricaoCodigo(String descricaoCodigo) {
		this.descricaoCodigo = descricaoCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

}
