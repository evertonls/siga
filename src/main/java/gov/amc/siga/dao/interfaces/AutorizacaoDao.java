package gov.amc.siga.dao.interfaces;

import java.util.List;

import gov.amc.siga.model.Autorizacao;
import gov.amc.siga.model.Usuario;

public interface AutorizacaoDao {

	public List<Autorizacao> getAutorizacoesFromUserId(Long id);

	public List<Autorizacao> getAutorizacoesFromUserCPF(String username);

	public List<Autorizacao> getAll();

	public void persistRoles(Usuario usuario);

}
