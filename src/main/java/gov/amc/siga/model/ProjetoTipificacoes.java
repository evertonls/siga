package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ProjetoTipificacoes implements Serializable {

	private static final long serialVersionUID = 1L;

	private String projetoTipoCodigo;
	private long projetoId;

	public ProjetoTipificacoes() {
	}

	public ProjetoTipificacoes(String projetoTipoCodigo, long projetoId) {
		this.projetoTipoCodigo = projetoTipoCodigo;
		this.projetoId = projetoId;
	}

	public String getProjetoTipoCodigo() {
		return projetoTipoCodigo;
	}

	public void setProjetoTipoCodigo(String projetoTipoCodigo) {
		this.projetoTipoCodigo = projetoTipoCodigo;
	}

	public long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(long projetoId) {
		this.projetoId = projetoId;
	}

}
