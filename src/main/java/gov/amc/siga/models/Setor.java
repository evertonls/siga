package gov.amc.siga.models;

import java.io.Serializable;
import java.text.Collator;
import java.util.Locale;
import java.util.Objects;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

@Component
public class Setor implements  Comparable<Setor>, Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	@NotBlank
	@Length(min = 3, max = 20)
	private String codigo;
	@NotBlank
	@Length(min = 3, max = 255)
	private String descricao;

	public Setor() {
		// Para uso do framework
	}

	public Setor(Long id, String codigo, String descricao) {
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Setor(Long id, String codigo) {
		this.id = id;
		this.codigo = codigo;
	}
		
	public Setor (String codigo) {
		this.codigo = codigo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this)
			return true;
		
		if(!(obj instanceof Setor))
			return false;
		
		Setor s = (Setor) obj;
		
		return Objects.equals(this.getCodigo(), s.getCodigo());
	}
	
	@Override
	public int compareTo(Setor o) {
		Collator brcollator = Collator.getInstance(new Locale("pt", "BR"));
		brcollator.setStrength(Collator.PRIMARY);
		try {
			return brcollator.compare(codigo, o.getCodigo());
		} catch (Exception e) {
			return 0;
		}
	}
	


}

