package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Aparelhamento implements Serializable{

	private static final long serialVersionUID = 1L;
	private long projetoId;
	private String aparelhamentoCodigo;
	private Double quantidade;
	
	public Aparelhamento() {	}

	public Aparelhamento(long projetoId, String aparelhamentoCodigo, Double quantidade) {
		this.projetoId = projetoId;
		this.aparelhamentoCodigo = aparelhamentoCodigo;
		this.quantidade = quantidade;
	}

    public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(long projetoId) {
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
