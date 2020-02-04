package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class MotivoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private String motivoCodigo;

	public MotivoProjeto() {
	}

	public MotivoProjeto(Long motivosId, Long projetoId, String motivoCodigo) {
		super();
		this.projetoId = projetoId;
		this.motivoCodigo = motivoCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public String getMotivoCodigo() {
		return motivoCodigo;
	}

	public void setMotivoCodigo(String motivoCodigo) {
		this.motivoCodigo = motivoCodigo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((motivoCodigo == null) ? 0 : motivoCodigo.hashCode());
		result = prime * result + ((projetoId == null) ? 0 : projetoId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MotivoProjeto other = (MotivoProjeto) obj;
		if (motivoCodigo == null) {
			if (other.motivoCodigo != null)
				return false;
		} else if (!motivoCodigo.equals(other.motivoCodigo))
			return false;
		if (projetoId == null) {
			if (other.projetoId != null)
				return false;
		} else if (!projetoId.equals(other.projetoId))
			return false;
		return true;
	}

}
