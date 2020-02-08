package gov.amc.siga.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import gov.amc.siga.dao.interfaces.EquipeTipoDao;
import gov.amc.siga.model.EquipeTipo;

@Component
@Scope(value = "view")
public class CadastroBean implements Serializable {

	private static final long serialVersionUID = 1L;	
	private EquipeTipoDao equipeTipoDao;
	private List<EquipeTipo> listaEquipes;
	private EquipeTipo eqSelecionada;

	@Autowired
	public CadastroBean(EquipeTipoDao equipeTipoDao) {
		super();
		this.equipeTipoDao = equipeTipoDao;

	}

	public List<EquipeTipo> getListaEquipes() {
		return listaEquipes;
	}

	public void setListaEquipes(List<EquipeTipo> listaEquipes) {
		this.listaEquipes = listaEquipes;
	}

	public EquipeTipo getEqSelecionada() {
		return eqSelecionada;
	}

	public void setEqSelecionada(EquipeTipo eqSelecionada) {
		this.eqSelecionada = eqSelecionada;
	}

	@PostConstruct
	private void loadObjects() {
		this.listaEquipes = new ArrayList<EquipeTipo>();
		this.listaEquipes = this.equipeTipoDao.listarTodasEquipesTipo();
	}

}
