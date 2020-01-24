package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Situacao implements Serializable {

	private static final long serialVersionUID = 1L;

	private String situacaoCodigo;
	private long projetoId;

	public Situacao() {
	}

	public Situacao(String situacaoCodigo, long projetoId) {
		super();
		this.situacaoCodigo = situacaoCodigo;
		this.projetoId = projetoId;
	}

	public String getSituacaoCodigo() {
		return situacaoCodigo;
	}

	public void setSituacaoCodigo(String situacaoCodigo) {
		this.situacaoCodigo = situacaoCodigo;
	}

	public long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(long projetoId) {
		this.projetoId = projetoId;
	}

	

}
