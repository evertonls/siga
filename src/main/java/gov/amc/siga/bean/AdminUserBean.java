package gov.amc.siga.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import gov.amc.siga.dao.SetorDAO;
import gov.amc.siga.dao.UsuarioDAO;
import gov.amc.siga.enums.BasicRole;
import gov.amc.siga.model.Autorizacao;
import gov.amc.siga.model.Setor;
import gov.amc.siga.model.Usuario;
import gov.amc.siga.service.UserPersistenceService;
import gov.amc.siga.util.EmailUtils;
import gov.amc.siga.util.EntityByNumberDao;
import gov.amc.siga.util.MaskHelper;
import gov.amc.siga.util.MessageHelper;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AdminUserBean {

    private Usuario usuario;
    private UsuarioDAO usuarioDao;
    private SetorDAO setorDao;
    private MessageHelper mh;
    private final Logger logger;
    private Validator validator;
    private List<Setor> setores;
    private UserPersistenceService ups;

    @Autowired
    public AdminUserBean(UsuarioDAO usuarioDAO, MessageHelper messageHelper, final Logger logger,
                         Validator validator, UserPersistenceService ups, SetorDAO setorDao) {
        this.usuarioDao = usuarioDAO;
        this.mh = messageHelper;
        this.logger = logger;
        this.validator = validator;
        this.setorDao = setorDao;
        this.ups = ups;

    }

    public String registerCommon() {

        Set<ConstraintViolation<Usuario>> violations = validator.validate(usuario);
        if (!violations.isEmpty()) {
            violations.forEach(v -> mh.addErrorMessage(v.getMessage()));
            return "";
        }

        this.usuario.setSenha(BCrypt.hashpw(usuario.getSenha(), BCrypt.gensalt()));
        this.usuario.setRoles(Arrays.asList(new Autorizacao(BasicRole.USUARIO.getRole())));
        this.usuario.setCpf(MaskHelper.removeCpfMask(this.usuario.getCpf()));

        try {
            ups.persist(usuario);
            mh.addflash(new FacesMessage("Usuário adicionado com sucesso!"));
        } catch (Exception e) {
            mh.addErrorMessage("Erro ao registrar usuário. Informar ao Administrador do sistema!");
            logger.info("Erro ao registrar usuário!", e);
            return "";
        }

        return "/usuarios/home?faces-redirect=true";

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Setor> getSetores() {
        return setores;
    }

    public void setSetores(List<Setor> setores) {
        this.setores = setores;
    }

    public void verificaCPF() {

        Usuario usuarioBD = (Usuario) new EntityByNumberDao().getEntity(usuarioDao, MaskHelper.removeCpfMask(usuario.getCpf()));

        if (usuarioBD != null) {
            mh.addWarnMessage("Aviso! Este usuário já possui cadastro no sistema com o " + "email:"
                    + EmailUtils.putMask(usuarioBD.getEmail()));
            usuarioBD = null;
        }

    }

    @PostConstruct
    private void loadObjects() {
        try {
            this.usuario = new Usuario();
            this.setores = new ArrayList<Setor>();
            this.setores = StreamSupport.stream(setorDao.getAll().spliterator(), true)
                    .sorted(Comparator.<Setor>naturalOrder()).collect(Collectors.toList());
        } catch (Exception e) {
            logger.info("Erro na obtenção dos dados!");
        }
    }

}
