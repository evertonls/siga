package gov.amc.siga.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MessageHelper {
	
	
	FacesContext facesContext;
	
	@Autowired
	public MessageHelper(FacesContext facesContext) {
		this.facesContext = facesContext;
	}
	
	public void addflash(FacesMessage message) {
		facesContext.addMessage(null, message);
		facesContext.getExternalContext().getFlash()
		.setKeepMessages(true);
	}
	
	public void addWarnMessage(String message) {
		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
				message, null));			
	}
	
	public void addSuccessMessage(String message) {
		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				message, null));			
	}
	
	public void addErrorMessage(String message) {
		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				message, null));			
	}
}