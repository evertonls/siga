package gov.amc.siga.util;

import gov.amc.siga.model.Usuario;

public interface IAuthenticationFacade {
	Usuario getAuthenticatedUser();
}
