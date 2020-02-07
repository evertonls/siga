package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class ClassificacaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String classificacaoCodigo;
	private String classificacaoDescricao;

	public ClassificacaoTipo() {
	}

	public ClassificacaoTipo(String classificacaoCodigo, String classificacaoDescricao) {
		super();
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

	@Override
	public int hashCode() {
		return Objects.hash(classificacaoCodigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ClassificacaoTipo))
			return false;

		ClassificacaoTipo c = (ClassificacaoTipo) obj;

		return Objects.equals(classificacaoCodigo, c.getClassificacaoCodigo());
	}

}