package gov.amc.siga.daos.interfaces;

import java.util.List;

import gov.amc.siga.models.Usuario;

public interface UsuarioDAO {

	public Usuario getByEmail(String username);

	public Usuario getByCpf(String cpf);

	public long persistUser(Usuario usuario);

	public Iterable<Usuario> getAll();

	public void gravaCodRecuperacao(String codigo, String email);

	public String getCodRecuperacao(String cpf);

	public void updatePassword(String senha, String cpf);

	public void updateCodRecuperacaoToNull(String cpf);

	public List<String> getByEmailWarn();

	public Object getbyNumber(String number);
}