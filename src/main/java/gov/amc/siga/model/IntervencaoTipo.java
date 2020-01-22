package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class IntervencaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String intervencaoCodigo;
	private String intervencaoDescricao;

	public IntervencaoTipo() {
	}

	public IntervencaoTipo(String intervencaoCodigo, String intervencaoDescricao) {
		this.intervencaoCodigo = intervencaoCodigo;
		this.intervencaoDescricao = intervencaoDescricao;
	}

	public String getIntervencaoCodigo() {
		return intervencaoCodigo;
	}

	public void setIntervencaoCodigo(String intervencaoCodigo) {
		this.intervencaoCodigo = intervencaoCodigo;
	}

	public String getIntervencaoDescricao() {
		return intervencaoDescricao;
	}

	public void setIntervencaoDescricao(String intervencaoDescricao) {
		this.intervencaoDescricao = intervencaoDescricao;
	}

}