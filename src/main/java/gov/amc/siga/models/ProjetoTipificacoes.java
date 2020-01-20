package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ProjetoTipificacoes implements Serializable {

	private static final long serialVersionUID = 1L;

	private String projetoTipoCodigo;
	private Long projetoId;

	public ProjetoTipificacoes() {
	}

	public ProjetoTipificacoes(String projetoTipoCodigo, Long projetoId) {
		this.projetoTipoCodigo = projetoTipoCodigo;
		this.projetoId = projetoId;
	}

	public String getProjetoTipoCodigo() {
		return projetoTipoCodigo;
	}

	public void setProjetoTipoCodigo(String projetoTipoCodigo) {
		this.projetoTipoCodigo = projetoTipoCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

}
