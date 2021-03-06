package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class DescricaoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String descricaoCodigo;
	private String descricaoDescricao;

	public DescricaoTipo() {
	}

	public DescricaoTipo(String descricaoCodigo, String descricaoDescricao) {
		super();
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

	@Override
	public int hashCode() {
		return Objects.hash(descricaoCodigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof DescricaoTipo))
			return false;
		if (getClass() != obj.getClass())
			return true;

		DescricaoTipo dt = (DescricaoTipo) obj;

		return Objects.equals(descricaoCodigo, dt.getDescricaoCodigo());

	}

}