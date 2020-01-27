package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Equipe implements Serializable {

	private static final long serialVersionUID = 1L;

	private String equipeCodigo;
	private long projetoId;

	public Equipe() { 	}

	public Equipe(String equipeCodigo, long projetoId) {
		this.equipeCodigo = equipeCodigo;
		this.projetoId = projetoId;
	}

	public String getEquipeCodigo() {
		return equipeCodigo;
	}

	public void setEquipeCod(String equipeCodigo) {
		this.equipeCodigo = equipeCodigo;
	}

	public long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(long projetoId) {
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
		result = prime * result + (int) (projetoId ^ (projetoId >>> 32));
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
		Equipe other = (Equipe) obj;
		if (equipeCodigo == null) {
			if (other.equipeCodigo != null)
				return false;
		} else if (!equipeCodigo.equals(other.equipeCodigo))
			return false;
		if (projetoId != other.projetoId)
			return false;
		return true;
	}
	
	
	
	
}
