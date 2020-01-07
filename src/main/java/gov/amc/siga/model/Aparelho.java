package gov.amc.siga.model;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

@Component
public class Aparelho implements Comparable<Aparelho>, Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@NotBlank
	private String aparelho_cod;
	
	private String aparelho_desc;
	private List<Aparelho> aparelhos;
	private Projeto projeto;

	public Aparelho() {
	}

	public Aparelho(String aparelho_cod, String aparelho_desc) {
		super();
		this.aparelho_cod = aparelho_cod;
		this.aparelho_desc = aparelho_desc;
	}

	public String getAparelho_cod() {
		return aparelho_cod;
	}

	public String getAparelho_desc() {
		return aparelho_desc;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setAparelho_cod(String aparelho_cod) {
		this.aparelho_cod = aparelho_cod;
	}

	public void setAparelho_desc(String aparelho_desc) {
		this.aparelho_desc = aparelho_desc;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	public List<Aparelho> getAparelhos() {
		return aparelhos;
	}

	public void setAparelhos(List<Aparelho> aparelhos) {
		this.aparelhos = aparelhos;
	}

	@Override
	public int compareTo(Aparelho o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
