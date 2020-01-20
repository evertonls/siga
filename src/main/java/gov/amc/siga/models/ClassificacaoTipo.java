package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ClassificacaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String classificacaoCodigo;
	private String classificacaoDescricao;

	public ClassificacaoTipo() {
	}

	public ClassificacaoTipo(String classificacaoCodigo, String classificacaoDescricao) {
		this.classificacaoCodigo = classificacaoCodigo;
		this.classificacaoDescricao = classificacaoDescricao;
	}

	public String getClassificacaoCodigo() {
		return classificacaoCodigo;
	}

	public void setClassificacaoCodigo(String classificacaoCodigo) {
		this.classificacaoCodigo = classificacaoCodigo;
	}

	public String getClassificacaoDescricao() {
		return classificacaoDescricao;
	}

	public void setClassificacaoDescricao(String classificacaoDescricao) {
		this.classificacaoDescricao = classificacaoDescricao;
	}

}