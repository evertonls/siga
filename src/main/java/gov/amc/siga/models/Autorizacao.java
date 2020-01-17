package gov.amc.siga.models;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

@Component
public class Autorizacao implements GrantedAuthority, Serializable {

	private static final long serialVersionUID = 1L;
	private String authority;
	private String descricao;
	
	public Autorizacao() {
		
	}

	public Autorizacao(String nome) {
		this.authority = nome;
	}

	public Autorizacao(String nome, String descricao) {
		super();
		this.authority = nome;
		this.descricao = descricao;
	}

	@Override
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		if (!(obj instanceof Autorizacao))
			return false;

		Autorizacao r = (Autorizacao) obj;

		return Objects.equals(authority, r.authority);
	}

	@Override
	public int hashCode() {
		return Objects.hash(authority);
	}

}
