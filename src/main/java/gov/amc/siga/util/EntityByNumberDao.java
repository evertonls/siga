package gov.amc.siga.util;

import gov.amc.siga.dao.UsuarioDao;

public class EntityByNumberDao {
	
	public Object getEntity(ICallEntitybyNumber dao, String number) {
		try {
			return dao.getbyNumber(number);
		} catch (Exception e) {
			return null;
		}
	}

	public Object getEntity(UsuarioDao usuarioDao, String number) {
		try {
			return usuarioDao.getbyNumber(number);
		} catch (Exception e) {
		return null;
		}
	}
}