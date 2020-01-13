package gov.amc.siga.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TipoSituacao implements Comparable<TipoSituacao>, Serializable {
	
	private static final long serialVersionUID = 1L;
	private String code;
	private String descricao;
	private List<TipoSituacao> tiposSituacao;

	public TipoSituacao() {

	}

	public TipoSituacao(String code, String especificacao) {
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
	public int compareTo(TipoSituacao arg0) {
		return 0;
	}

	public List<TipoSituacao> getTiposSituacao() {
		return tiposSituacao;
	}

	public void setTiposSituacao(List<TipoSituacao> tiposSituacao) {
		this.tiposSituacao = tiposSituacao;
	}

}