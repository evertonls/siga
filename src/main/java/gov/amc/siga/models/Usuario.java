package gov.amc.siga.models;

import java.io.Serializable;
import java.text.Collator;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class Usuario implements UserDetails, Comparable<Usuario>, Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	@NotBlank
	@Length(min = 3, max = 255)
	private String nome;
	@CPF
	@NotBlank
	private String cpf;
	@Pattern(regexp = "^[\\d]{4,8}$|^$", message = "{field.matricula.validation.contraints.Pattern.message}")
	private String matricula;
	@Email
	@NotBlank
	private String email;
	@NotNull(message = "{field.emailWarn.validation.contraints.NotNull.message}")
	private boolean emailWarn;
	@NotBlank
	@Pattern(regexp = "^.{6,10}$", message = "{field.senha.validation.contraints.Pattern.message}")
	private String senha;
	private String codRecuperacao;
	private Setor setor;
	private List<Autorizacao> roles;
	@NotBlank
	private String confSenha;
	@Email
	@NotBlank
	private String confEmail;

	public Usuario() {
	}

	public Usuario(String cpf) {
		this.cpf = cpf;
	}

	public Usuario(long id, String cpf, String nome, String email, String matricula) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.matricula = matricula;
	}

	public Usuario(Long id, String email, String cpf, String senha, String matricula, String nome,
			String codRecuperacao) {
		super();
		this.id = id;
		this.email = email;
		this.cpf = cpf;
		this.senha = senha;
		this.matricula = matricula;
		this.nome = nome;
		this.codRecuperacao = codRecuperacao;
	}

	public Usuario(Long id, String nome, String cpf, String matricula, String email, String senha,
			List<Autorizacao> roles, Setor setor) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.email = email;
		this.senha = senha;
		this.setor = setor;
		this.roles = roles;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Setor getSetor() {
		return this.setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public String getCodRecuperacao() {
		return codRecuperacao;
	}

	public void setCodRecuperacao(String codRecuperacao) {
		this.codRecuperacao = codRecuperacao;
	}

	public List<Autorizacao> getRoles() {
		return roles;
	}

	public void setRoles(List<Autorizacao> roles) {
		this.roles = roles;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAuthorities(List<Autorizacao> roles) {
		this.roles.addAll(roles);
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getConfSenha() {
		return confSenha;
	}

	public void setConfSenha(String confSenha) {
		this.confSenha = confSenha;
	}

	public String getConfEmail() {
		return confEmail;
	}

	public void setConfEmail(String confEmail) {
		this.confEmail = confEmail;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.roles;
	}

	@Override
	public String getPassword() {
		return this.senha;
	}

	@Override
	public String getUsername() {
		return this.cpf;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String toString() {
		return nome;
	}

	public boolean isEmailWarn() {
		return emailWarn;
	}

	public void setEmailWarn(boolean emailWarn) {
		this.emailWarn = emailWarn;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this)
			return true;

		if (!(obj instanceof Usuario))
			return false;

		Usuario usuario = (Usuario) obj;

		return usuario.cpf.equals(cpf);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public int compareTo(Usuario o) {
		Collator brCollator = Collator.getInstance(new Locale("pt", "BR"));
		brCollator.setStrength(Collator.PRIMARY);
		return brCollator.compare(nome, o.getNome());
	}

}
