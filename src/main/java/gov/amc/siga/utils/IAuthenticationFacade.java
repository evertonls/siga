package gov.amc.siga.utils;

import gov.amc.siga.models.Usuario;

public interface IAuthenticationFacade {
	Usuario getAuthenticatedUser();
}
