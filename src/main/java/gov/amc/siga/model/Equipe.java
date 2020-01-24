package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Equipe implements Serializable {

	private static final long serialVersionUID = 1L;

	private String equipeCodigo;
	private Long projetoId;

	public Equipe() { 	}

	public Equipe(String equipeCodigo, Long projetoId) {
		this.equipeCodigo = equipeCodigo;
		this.projetoId = projetoId;
	}

	public String getEquipeCodigo() {
		return equipeCodigo;
	}

	public void setEquipeCod(String equipeCodigo) {
		this.equipeCodigo = equipeCodigo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}
}
