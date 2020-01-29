package gov.amc.siga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import gov.amc.siga.dao.interfaces.AutorizacaoDao;
import gov.amc.siga.dao.interfaces.UsuarioDao;
import gov.amc.siga.model.Usuario;

@Service
public class UserPersistenceService {

	private UsuarioDao usuarioDao;
	private AutorizacaoDao autDao;

	@Autowired
	public UserPersistenceService(UsuarioDao usuarioDao, AutorizacaoDao autDao) {
		super();
		this.usuarioDao = usuarioDao;
		this.autDao = autDao;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void persist(Usuario usuario) {
		long id = usuarioDao.persistUser(usuario);
		usuario.setId(id);
		autDao.persistRoles(usuario);
	}

}
