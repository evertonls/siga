package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Intervencoes implements Serializable{

	private static final long serialVersionUID = 1L;

	private String intervencaoCodigo;
	private String projetoId;
	private int quantidade;
	
	public Intervencoes() {	}

	public Intervencoes(String intervencaoCodigo, String projetoId, int quantidade) {
		this.intervencaoCodigo = intervencaoCodigo;
		this.projetoId = projetoId;
		this.quantidade = quantidade;
	}

	public String getIntervencaoCodigo() {
		return intervencaoCodigo;
	}

	public void setIntervencaoCodigo(String intervencaoCodigo) {
		this.intervencaoCodigo = intervencaoCodigo;
	}

	public String getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(String projetoId) {
		this.projetoId = projetoId;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
