package gov.amc.siga.models;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Classificacoes implements Serializable{

	private static final long serialVersionUID = 1L;
	private String classificacao_cod;
	private Long projeto_id;
	
	public Classificacoes() {
	}

	public Classificacoes(String classificacao_cod, Long projeto_id) {
		super();
		this.classificacao_cod = classificacao_cod;
		this.projeto_id = projeto_id;
	}

	public String getClassificacao_cod() {
		return classificacao_cod;
	}

	public void setClassificacao_cod(String classificacao_cod) {
		this.classificacao_cod = classificacao_cod;
	}

	public Long getProjeto_id() {
		return projeto_id;
	}

	public void setProjeto_id(Long projeto_id) {
		this.projeto_id = projeto_id;
	}
	
	
	
}
