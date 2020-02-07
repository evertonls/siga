package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class SituacaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String situacaoCodigo;
	private String situacaoDescricao;

	public SituacaoTipo() {
	}

	public SituacaoTipo(String situacaoCodigo, String situacaoDescricao) {
		super();
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

	@Override
	public int hashCode() {
		return Objects.hash(situacaoCodigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SituacaoTipo))
			return false;

		SituacaoTipo sp = (SituacaoTipo) obj;

		return Objects.equals(situacaoCodigo, sp.getSituacaoCodigo());
	}

}