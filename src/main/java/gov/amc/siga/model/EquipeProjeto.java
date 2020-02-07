package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class EquipeProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private EquipeTipo equipeTipo;

	public EquipeProjeto() {
	}

	public EquipeProjeto(Long projetoId, EquipeTipo equipeTipo) {
		super();
		this.projetoId = projetoId;
		this.equipeTipo = equipeTipo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public EquipeTipo getEquipeTipo() {
		return equipeTipo;
	}

	public void setEquipeTipo(EquipeTipo equipeTipo) {
		this.equipeTipo = equipeTipo;
	}

}
