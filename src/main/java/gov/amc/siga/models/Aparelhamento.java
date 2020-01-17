package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Aparelhamento implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long projeto_id;
	private String aparelho_cod;
	private Double quantidade;
	
	public Aparelhamento() {
	}

	public Aparelhamento(Long projeto_id, String aparelho_cod, Double quantidade) {
		super();
		this.projeto_id = projeto_id;
		this.aparelho_cod = aparelho_cod;
		this.quantidade = quantidade;
	}

	public Long getProjeto_id() {
		return projeto_id;
	}

	public void setProjeto_id(Long projeto_id) {
		this.projeto_id = projeto_id;
	}

	public String getAparelho_cod() {
		return aparelho_cod;
	}

	public void setAparelho_cod(String aparelho_cod) {
		this.aparelho_cod = aparelho_cod;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	 
}
