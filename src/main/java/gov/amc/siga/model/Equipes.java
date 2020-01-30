package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Equipes implements Serializable {

	private static final long serialVersionUID = 1L;

	private String equipeCodigo;
	private Long projetoId;

	public Equipes() {
	}

	public Equipes(String equipeCodigo, Long projetoId) {
		super();
		this.equipeCodigo = equipeCodigo;
		this.projetoId = projetoId;
	}

	public String getEquipeCodigo() {
		return equipeCodigo;
	}

	public void setEquipeCodigo(String equipeCodigo) {
		this.equipeCodigo = equipeCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	@Override
	public String toString() {
		return "Equipe [equipeCodigo=" + equipeCodigo + ", projetoId=" + projetoId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipeCodigo == null) ? 0 : equipeCodigo.hashCode());
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
		Equipes other = (Equipes) obj;
		if (equipeCodigo == null) {
			if (other.equipeCodigo != null)
				return false;
		} else if (!equipeCodigo.equals(other.equipeCodigo))
			return false;
		if (projetoId == null) {
			if (other.projetoId != null)
				return false;
		} else if (!projetoId.equals(other.projetoId))
			return false;
		return true;
	}

}
