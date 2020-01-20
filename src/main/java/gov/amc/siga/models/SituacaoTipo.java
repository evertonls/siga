package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class SituacaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String situacaoCodigo;
	private String situacaoDescricao;

	public SituacaoTipo() {
	}

	public SituacaoTipo(String situacaoCodigo, String situacaoDescricao) {
		this.situacaoCodigo = situacaoCodigo;
		this.situacaoDescricao = situacaoDescricao;
	}

	public String getSituacaoCodigo() {
		return situacaoCodigo;
	}

	public void setSituacaoCodigo(String situacaoCodigo) {
		this.situacaoCodigo = situacaoCodigo;
	}

	public String getSituacaoDescricao() {
		return situacaoDescricao;
	}

	public void setSituacaoDescricao(String situacaoDescricao) {
		this.situacaoDescricao = situacaoDescricao;
	}

}