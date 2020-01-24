package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Classificacao implements Serializable{

	private static final long serialVersionUID = 1L;
	private String classificacaoCodigo;
	private Long projetoId;
	
	public Classificacao() {	}

	public Classificacao(String classificacaoCodigo, Long projetoId) {
		this.classificacaoCodigo = classificacaoCodigo;
		this.projetoId = projetoId;
	}

	public String getClassificacaoCodigo() {
		return classificacaoCodigo;
	}

	public void setClassificacaoCod(String classificacaoCodigo) {
		this.classificacaoCodigo = classificacaoCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}
	
	

		
}
