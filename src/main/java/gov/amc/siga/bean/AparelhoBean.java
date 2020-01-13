package gov.amc.siga.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import gov.amc.siga.JDBCTemplate.AparelhoJBDCTemplate;
import gov.amc.siga.model.Aparelho;

@Named
@ViewScoped
public class AparelhoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Aparelho aparelhoSelecionado;

	@Inject
	private AparelhoJBDCTemplate aparelhoJBDCTemplate;
	
	

	public Aparelho getAparelhoSelecionado() {
		return aparelhoSelecionado;
	}



	public AparelhoJBDCTemplate getAparelhoJBDCTemplate() {
		return aparelhoJBDCTemplate;
	}



	public void setAparelhoSelecionado(Aparelho aparelhoSelecionado) {
		this.aparelhoSelecionado = aparelhoSelecionado;
	}



	public void setAparelhoJBDCTemplate(AparelhoJBDCTemplate aparelhoJBDCTemplate) {
		this.aparelhoJBDCTemplate = aparelhoJBDCTemplate;
	}



	public List<Aparelho> getAparelhos() {
		System.out.println("Carregando Aparelhos...");
		
		return aparelhoJBDCTemplate.procurarTodos();
	}

}
