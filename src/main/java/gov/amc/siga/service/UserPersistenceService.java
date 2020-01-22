package gov.amc.siga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import gov.amc.siga.dao.AutorizacaoDAO;
import gov.amc.siga.dao.UsuarioDAO;
import gov.amc.siga.model.Usuario;

@Service
public class UserPersistenceService {

	private UsuarioDAO usuarioDao;
	private AutorizacaoDAO autDao;

	@Autowired
	public UserPersistenceService(UsuarioDAO usuarioDao, AutorizacaoDAO autDao) {
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
