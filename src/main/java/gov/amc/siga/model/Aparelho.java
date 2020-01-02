package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Aparelho implements Comparable<Aparelho>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String especificacao;

	public Aparelho() {

	}

	public Aparelho(String code, String especificacao) {
		super();
		this.code = code;
		this.especificacao = especificacao;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	@Override
	public int compareTo(Aparelho arg0) {
		return 0;
	}

}
