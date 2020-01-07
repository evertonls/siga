package gov.amc.siga.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TipoProjeto implements Comparable<TipoProjeto>, Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String code;
	private String descricao;
	private List<TipoProjeto> tiposProjeto;

	public TipoProjeto() {

	}

	public TipoProjeto(String code, String especificacao) {
		super();
		this.code = code;
		this.descricao = especificacao;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEspecificacao() {
		return descricao;
	}

	public void setEspecificacao(String especificacao) {
		this.descricao = especificacao;
	}

	@Override
	public int compareTo(TipoProjeto arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<TipoProjeto> getTiposProjeto() {
		return tiposProjeto;
	}

	public void setTiposProjeto(List<TipoProjeto> tiposProjeto) {
		this.tiposProjeto = tiposProjeto;
	}

}
