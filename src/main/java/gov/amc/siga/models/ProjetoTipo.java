package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ProjetoTipo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String projetoTipoCodigo;
	private String projetoTipoDescricao;

	public ProjetoTipo() {
	}

	public ProjetoTipo(String projetoTipoCodigo, String projetoTipoDescricao) {
		this.projetoTipoCodigo = projetoTipoCodigo;
		this.projetoTipoDescricao = projetoTipoDescricao;
	}

	public String getProjetoTipoCodigo() {
		return projetoTipoCodigo;
	}

	public void setProjetoTipoCodigo(String projetoTipoCodigo) {
		this.projetoTipoCodigo = projetoTipoCodigo;
	}

	public String getProjetoTipoDescricao() {
		return projetoTipoDescricao;
	}

	public void setProjetoTipoDescricao(String projetoTipoDescricao) {
		this.projetoTipoDescricao = projetoTipoDescricao;
	}

}
