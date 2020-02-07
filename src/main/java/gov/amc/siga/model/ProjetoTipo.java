package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class ProjetoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String projetoTipoCodigo;
	private String projetoTipoDescricao;

	public ProjetoTipo() {
	}

	public ProjetoTipo(String projetoTipoCodigo, String projetoTipoDescricao) {
		super();
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

	@Override
	public int hashCode() {
		return Objects.hash(projetoTipoCodigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ProjetoTipo))
			return false;

		ProjetoTipo pt = (ProjetoTipo) obj;

		return Objects.equals(projetoTipoCodigo, pt.getProjetoTipoCodigo());
	}

}
