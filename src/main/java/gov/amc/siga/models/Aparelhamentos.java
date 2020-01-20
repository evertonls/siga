package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Aparelhamentos implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private String aparelhamentoCodigo;
	private Double quantidade;
	
	public Aparelhamentos() {	}

	public Aparelhamentos(Long projetoId, String aparelhamentoCodigo, Double quantidade) {
		this.projetoId = projetoId;
		this.aparelhamentoCodigo = aparelhamentoCodigo;
		this.quantidade = quantidade;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public String getaAparelhamentoCodigo() {
		return aparelhamentoCodigo;
	}

	public void setAparelhamentoCodigo(String aparelhamentoCodigo) {
		this.aparelhamentoCodigo = aparelhamentoCodigo;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}


	 
}
