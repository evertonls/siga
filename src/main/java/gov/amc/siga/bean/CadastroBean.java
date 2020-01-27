package gov.amc.siga.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import gov.amc.siga.dao.imple.AparelhoDaoImple;
import gov.amc.siga.model.Aparelho;

@Named
@ManagedBean
@ViewScoped
public class CadastroBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Aparelho aparelho = new Aparelho();
	
	private AparelhoDaoImple aparelhoDaoImple = new AparelhoDaoImple();
	
	private List<Aparelho> list = new ArrayList<Aparelho>();
	
	public List<Aparelho> getAparelhos(){
		list = new ArrayList<Aparelho>();
		return list;
	}
	
}
