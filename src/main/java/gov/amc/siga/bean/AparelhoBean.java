package gov.amc.siga.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import gov.amc.siga.model.Aparelho;
import gov.amc.siga.repository.AparelhoRepository;

@Named
@ViewScoped
public class AparelhoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Aparelho aparelhoSelecionado;

	@Inject
	private AparelhoRepository aparelhoJBDCTemplate;
	
	

	public Aparelho getAparelhoSelecionado() {
		return aparelhoSelecionado;
	}



	public AparelhoRepository getAparelhoJBDCTemplate() {
		return aparelhoJBDCTemplate;
	}



	public void setAparelhoSelecionado(Aparelho aparelhoSelecionado) {
		this.aparelhoSelecionado = aparelhoSelecionado;
	}



	public void setAparelhoJBDCTemplate(AparelhoRepository aparelhoJBDCTemplate) {
		this.aparelhoJBDCTemplate = aparelhoJBDCTemplate;
	}



	public List<Aparelho> getAparelhos() {
		System.out.println("Carregando Aparelhos...");
		
		return aparelhoJBDCTemplate.procurarTodos();
	}

}
