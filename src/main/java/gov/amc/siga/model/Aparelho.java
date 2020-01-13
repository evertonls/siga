package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Aparelho implements Serializable {

	private static final long serialVersionUID = 1L;
	private String aparelho_cod;
	private String aparelho_desc;

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

	public void setAparelho_cod(String aparelho_cod) {
		this.aparelho_cod = aparelho_cod;
	}

	public void setAparelho_desc(String aparelho_desc) {
		this.aparelho_desc = aparelho_desc;
	}

}
