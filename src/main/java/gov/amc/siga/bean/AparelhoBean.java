package gov.amc.siga.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Named;

import org.springframework.stereotype.Component;

import gov.amc.siga.model.Aparelho;

@Named
@Component
@ManagedBean
public class AparelhoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Aparelho> aparelhos;
	
	public List<Aparelho> getAparelho(){
		List<Aparelho> aparelhos = new ArrayList<>();
		
		return aparelhos; 
	}
	
	
}
