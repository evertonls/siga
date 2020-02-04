package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class EquipeTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String equipeCodigo;
	private String equipeDescricao;

	public EquipeTipo() {
	}

	public EquipeTipo(Long equipeTipoId, String equipeCodigo, String equipeDescricao) {
		super();
		this.equipeCodigo = equipeCodigo;
		this.equipeDescricao = equipeDescricao;
	}

	public String getEquipeCodigo() {
		return equipeCodigo;
	}

	public void setEquipeCodigo(String equipeCodigo) {
		this.equipeCodigo = equipeCodigo;
	}

	public String getEquipeDescricao() {
		return equipeDescricao;
	}

	public void setEquipeDescricao(String equipeDescricao) {
		this.equipeDescricao = equipeDescricao;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipeCodigo == null) ? 0 : equipeCodigo.hashCode());
		result = prime * result + ((equipeDescricao == null) ? 0 : equipeDescricao.hashCode());
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
		EquipeTipo other = (EquipeTipo) obj;
		if (equipeCodigo == null) {
			if (other.equipeCodigo != null)
				return false;
		} else if (!equipeCodigo.equals(other.equipeCodigo))
			return false;
		if (equipeDescricao == null) {
			if (other.equipeDescricao != null)
				return false;
		} else if (!equipeDescricao.equals(other.equipeDescricao))
			return false;
		return true;
	}

}
