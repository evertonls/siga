package gov.amc.siga.utils;

import gov.amc.siga.daos.interfaces.UsuarioDAO;

public class EntityByNumberDao {
	
	public Object getEntity(ICallEntitybyNumber dao, String number) {
		try {
			return dao.getbyNumber(number);
		} catch (Exception e) {
			return null;
		}
	}

	public Object getEntity(UsuarioDAO usuarioDao, String number) {
		try {
			return usuarioDao.getbyNumber(number);
		} catch (Exception e) {
		return null;
		}
	}
}