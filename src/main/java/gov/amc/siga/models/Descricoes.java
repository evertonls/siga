package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Descricoes implements Serializable {

	private static final long serialVersionUID = 1L;
	private String descricao_cod;
	private Long projeto_id;
	
	public Descricoes() {
	}

	public Descricoes(String descricao_cod, Long projeto_id) {
		super();
		this.descricao_cod = descricao_cod;
		this.projeto_id = projeto_id;
	}

	public String getDescricao_cod() {
		return descricao_cod;
	}

	public void setDescricao_cod(String descricao_cod) {
		this.descricao_cod = descricao_cod;
	}

	public Long getProjeto_id() {
		return projeto_id;
	}

	public void setProjeto_id(Long projeto_id) {
		this.projeto_id = projeto_id;
	}

	
}
