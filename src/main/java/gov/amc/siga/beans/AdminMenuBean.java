package gov.amc.siga.beans;


import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import gov.amc.siga.models.Usuario;
import gov.amc.siga.utils.IAuthenticationFacade;
import gov.amc.siga.utils.StringUtils;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AdminMenuBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Usuario usuario;
	private transient Logger logger;
	private StringBuilder nome;
	private IAuthenticationFacade authFacade;

	@Autowired
	public AdminMenuBean(Logger logger, IAuthenticationFacade authFacade) {
		this.logger = logger;
		this.authFacade = authFacade;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public StringBuilder getNome() {
		return nome;
	}

	public void setNome(StringBuilder nome) {
		this.nome = nome;
	}
	
	

	@PostConstruct
	private void loadObjects() {
		try {
			logger.info("Carregando o Menu do sistema juntamente com o usuário logado");
			this.usuario = authFacade.getAuthenticatedUser();
		} catch (Exception e) {
			logger.info("Não foi possível obter o usuário!");
		}
		this.nome = new StringBuilder();
		this.nome.append(StringUtils.toCamelCase(usuario.getNome().substring(0, usuario.getNome().indexOf(" "))));
		
	}

}
