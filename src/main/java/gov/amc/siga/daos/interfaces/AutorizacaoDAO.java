package gov.amc.siga.daos.interfaces;

import java.util.List;

import gov.amc.siga.models.Autorizacao;
import gov.amc.siga.models.Usuario;

public interface AutorizacaoDAO {

	public List<Autorizacao> getAutorizacoesFromUserId(Long id);

	public List<Autorizacao> getAutorizacoesFromUserCPF(String username);

	public List<Autorizacao> getAll();

	public void persistRoles(Usuario usuario);

}
