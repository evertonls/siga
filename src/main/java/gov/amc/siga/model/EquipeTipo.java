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

	public EquipeTipo(String equipeCodigo, String equipeDescricao) {
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

}
