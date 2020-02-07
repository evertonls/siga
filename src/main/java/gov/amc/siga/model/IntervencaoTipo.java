package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class IntervencaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String intervencaoCodigo;
	private String intervencaoDescricao;

	public IntervencaoTipo() {
	}

	public IntervencaoTipo(Long intervencaoTipoId, String intervencaoCodigo, String intervencaoDescricao) {
		super();
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

	@Override
	public int hashCode() {
		return Objects.hash(intervencaoCodigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof IntervencaoTipo))
			return false;

		IntervencaoTipo it = (IntervencaoTipo) obj;

		return Objects.equals(intervencaoCodigo, it.getIntervencaoCodigo());

	}

}