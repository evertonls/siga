package gov.amc.siga.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import gov.amc.siga.daos.JdbcUsuarioDao;
import gov.amc.siga.models.Usuario;

@Service("userDetailsService")
public class UsuarioDetailsService implements UserDetailsService{
	
	private JdbcUsuarioDao jdbcUsuarioDAO;
	
	@Autowired
	public UsuarioDetailsService(JdbcUsuarioDao jdbcUsuarioDAO) {
		super();
		this.jdbcUsuarioDAO = jdbcUsuarioDAO;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(jdbcUsuarioDAO.getByCpf(username));
		
		if(usuarios.isEmpty()) 
			throw new UsernameNotFoundException("O usuário " + username + " não existe!");
		
		
		return usuarios.get(0);
	}

}