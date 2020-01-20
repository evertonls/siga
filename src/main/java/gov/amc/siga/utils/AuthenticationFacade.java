package gov.amc.siga.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import gov.amc.siga.daos.interfaces.UsuarioDAO;
import gov.amc.siga.models.Usuario;

@Component
public class AuthenticationFacade implements IAuthenticationFacade {

	@Autowired
	private UsuarioDAO udao;

	@Override
	public Usuario getAuthenticatedUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			return udao.getByCpf(authentication.getName());
		}
		return null;
	}

}
