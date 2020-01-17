package gov.amc.siga.enums;

public enum BasicRole {

	USUARIO("ROLE_USUARIO"),
	SUBADMIN("ROLE_SUBADMIN"),
	ADMINISTRADOR("ROLE_ADMIN");

	private String role;

	BasicRole(String tipoRole) {
		role = tipoRole;
	}
	
	public String getRole() {
		return role;
	}
}
