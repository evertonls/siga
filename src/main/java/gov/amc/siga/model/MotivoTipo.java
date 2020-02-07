package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class MotivoTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String motivoCodigo;
	private String motivoDescricao;

	public MotivoTipo() {
	}

	public MotivoTipo(String motivoCodigo, String motivoDescricao) {
		super();
		this.motivoCodigo = motivoCodigo;
		this.motivoDescricao = motivoDescricao;
	}

	public String getMotivoCodigo() {
		return motivoCodigo;
	}

	public void setMotivoCodigo(String motivoCodigo) {
		this.motivoCodigo = motivoCodigo;
	}

	public String getMotivoDescricao() {
		return motivoDescricao;
	}

	public void setMotivoDescricao(String motivoDescricao) {
		this.motivoDescricao = motivoDescricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(motivoCodigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MotivoTipo))
		return false;

		MotivoTipo mt = (MotivoTipo) obj;

		return Objects.deepEquals(motivoDescricao, mt.getMotivoCodigo());
	}
}