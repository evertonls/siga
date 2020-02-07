package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class EquipeTipo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String equipeCodigo;
	private String equipeDescricao;

	public EquipeTipo() {
	}

	public EquipeTipo(String equipeCodigo, String equipeDescricao) {
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
		return Objects.hash(equipeCodigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		if (!(obj instanceof EquipeTipo))
			return false;

		EquipeTipo et = (EquipeTipo) obj;

		return Objects.equals(equipeCodigo, et.getEquipeCodigo());
	}

}
