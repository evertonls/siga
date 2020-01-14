package gov.amc.siga.bean;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import gov.amc.siga.model.Aparelho;
import gov.amc.siga.repository.AparelhoRepository;

@Named
public class AparelhoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private AparelhoRepository aparelhoRepository;

	public List<Aparelho> getAparelhos() {
		
		System.out.println("getAparelhos foi chamado...");

		return aparelhoRepository.procurarTodosAparelhos();
	}

}
