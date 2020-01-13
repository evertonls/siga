package gov.amc.siga.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Motivo implements Comparable<Motivo>, Serializable {

	
	private static final long serialVersionUID = 1L;
	private String code;
	private String descricao;
	private List<Motivo> motivos;

	public Motivo() {

	}

	public Motivo(String code, String especificacao) {
		super();
		this.code = code;
		this.descricao = especificacao;
	}

	@Override
	public int compareTo(Motivo arg0) {
		return 0;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEspecificacao() {
		return descricao;
	}

	public void setEspecificacao(String especificacao) {
		this.descricao = especificacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Motivo> getMotivos() {
		return motivos;
	}

	public void setMotivos(List<Motivo> motivos) {
		this.motivos = motivos;
	}

}