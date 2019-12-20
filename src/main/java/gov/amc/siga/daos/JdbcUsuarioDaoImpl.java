package gov.amc.siga.daos;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Repository;

import gov.amc.siga.models.Autorizacao;
import gov.amc.siga.models.Setor;
import gov.amc.siga.models.Usuario;

@Repository
public class JdbcUsuarioDaoImpl implements JdbcUsuarioDao, Serializable {

	private static final long serialVersionUID = 1L;
	private JdbcTemplate template;
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private final String query = "SELECT u.usuario_id, u.usuario_nm, u.cpf_num, u.mat_num, u.email, u.senha, u.mail_warn, "
			+ "p.autoriza_cod, u.setor_id, s.setor_cod, s.setor_desc  " + "FROM usuarios u "
			+ "LEFT JOIN permissoes p ON u.usuario_id = p.usuario_id "
			+ "LEFT JOIN setores s ON u.setor_id = s.setor_id";

	@Autowired
	public JdbcUsuarioDaoImpl(DataSource ds) {
		this.template = new JdbcTemplate(ds);
	}

	@Override
	public Object getbyNumber(String number) {
		return getByCpf(number);
	}

	@Override
	public void updatePassword(String senha, String cpf) {
		template.update("UPDATE Usuarios SET senha = ? WHERE cpf_num = ?", BCrypt.hashpw(senha, BCrypt.gensalt()), cpf);
	}

	@Override
	public void updateCodRecuperacaoToNull(String cpf) {
		template.update("UPDATE usuarios SET recupera_cod = ? WHERE cpf_num = ?", null, cpf);
	}

	@Override
	public void gravaCodRecuperacao(String codigo, String email) {
		final String sql = "UPDATE usuarios SET recupera_cod = ? WHERE email = ?";
		template.update(sql, codigo, email);
	}

	@Override
	public String getCodRecuperacao(String cpf) {
		return template.queryForObject("SELECT recupera_cod FROM usuarios WHERE cpf_num = ?", String.class, cpf);
	}

	@Override
	public Usuario getByEmail(String email) {
		final String sql = query + " WHERE email = ?";

		List<Usuario> usuarios = template.query(sql, this::extractUsers, email);
		logger.info("Buscando usuário: " + email);
		return usuarios.get(0);
	}

	/*
	 * retorna os usuários que devem receber emails de notificação de qualquer
	 * contrato que esteja no prazo para renovação
	 */
	public List<String> getByEmailWarn() {
		final String sql = "SELECT email FROM usuarios WHERE mail_warn = true";

		return template.query(sql, new RowMapper<String>() {
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString("email");
			};
		});
	}

	@Override
	public Usuario getByCpf(String cpf) {
		final String sql = query + " WHERE u.cpf_num = ?";

		List<Usuario> usuarios = template.query(sql, this::extractUsers, cpf);
		logger.info("Buscando usuário: " + cpf);
		return usuarios.get(0);
	}

	/**
	 * Busca todos os usuários com seus respectivos níveis de acesso.
	 *
	 */
	@Override
	public Iterable<Usuario> getAll() {

		logger.info("Buscando Todos os usuários!");

		return template.query(query, this::extractUsers);
	}

	public long persistUser(Usuario usuario) {
		logger.info("Registrando o usuário: " + usuario.getEmail());
		final String sql = "INSERT INTO usuarios (usuario_nm, cpf_num, mat_num, email, senha, setor_id, mail_warn) VALUES (?, ?, ?, ?, ?, ?, ?)";
		KeyHolder keyHolder = new GeneratedKeyHolder();
		PreparedStatementCreatorFactory pscFactory = new PreparedStatementCreatorFactory(sql, Types.VARCHAR,
				Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.BIGINT, Types.BOOLEAN);
		pscFactory.setReturnGeneratedKeys(true);
		PreparedStatementCreator psc = pscFactory
				.newPreparedStatementCreator(Arrays.asList(usuario.getNome(), usuario.getCpf(), usuario.getMatricula(),
						usuario.getEmail(), usuario.getPassword(), usuario.getSetor().getId(), usuario.isEmailWarn()));

		template.update(psc, keyHolder);

		/*
		 * No caso do postgresql que retorna chaves multiplas, ou seja, a tupla inteira
		 * deve ser feito com abaixo.
		 */
		Long novoId;
		if (keyHolder.getKeys().size() > 1) {
			novoId = (Long) keyHolder.getKeys().get("usuario_id");
		} else {
			novoId = keyHolder.getKey().longValue();
		}

		logger.info("Registrado com o id: " + novoId);
		return novoId;
	}

	/* extrai cada linha do resultset de Usuário left join Role */

	private List<Usuario> extractUsers(ResultSet rs) throws SQLException, DataAccessException {
		Map<Long, Usuario> userMap = new HashMap<>();
		Usuario usuarioAtual = null;

		while (rs.next()) {

			Long id = rs.getLong("usuario_id");
			usuarioAtual = userMap.get(id);

			if (usuarioAtual == null) {
				usuarioAtual = new Usuario();
				usuarioAtual.setId(id);
				usuarioAtual.setNome(rs.getString("usuario_nm"));
				usuarioAtual.setCpf(rs.getString("cpf_num"));
				usuarioAtual.setMatricula(rs.getString("mat_num"));
				usuarioAtual.setSenha(rs.getString("senha"));
				usuarioAtual.setEmail(rs.getString("email"));
				usuarioAtual.setEmailWarn(rs.getBoolean("mail_warn"));
				usuarioAtual.setSetor(new Setor());
				usuarioAtual.getSetor().setId(rs.getLong("setor_id"));
				usuarioAtual.getSetor().setCodigo(rs.getString("setor_cod"));
				usuarioAtual.getSetor().setDescricao(rs.getString("setor_desc"));
				usuarioAtual.setRoles(new ArrayList<Autorizacao>());
				logger.info("Usuário: " + usuarioAtual.getEmail() + " carregado!");

				userMap.put(id, usuarioAtual);
			}

			String roleName = rs.getString("autoriza_cod");
			if (!roleName.isEmpty()) {
				Autorizacao role = new Autorizacao(roleName);
				logger.info("Carregando role: " + role.getAuthority());
				usuarioAtual.getRoles().add(role);
			}

		}

		return new ArrayList<Usuario>(userMap.values());
	}

}
