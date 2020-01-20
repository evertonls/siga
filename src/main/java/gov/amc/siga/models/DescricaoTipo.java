package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class DescricaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String descricaoCodigo;
	private String descricaoDescricao;

	public DescricaoTipo() {
	}

	public DescricaoTipo(String descricaoCodigo, String descricaoDescricao) {
		this.descricaoCodigo = descricaoCodigo;
		this.descricaoDescricao = descricaoDescricao;
	}

	public String getDescricaoCodigo() {
		return descricaoCodigo;
	}

	public void setDescricaoCodigo(String descricaoCodigo) {
		this.descricaoCodigo = descricaoCodigo;
	}

	public String getDescricaoDescricao() {
		return descricaoDescricao;
	}

	public void setDescricaoDescricao(String descricaoDescricao) {
		this.descricaoDescricao = descricaoDescricao;
	}

}