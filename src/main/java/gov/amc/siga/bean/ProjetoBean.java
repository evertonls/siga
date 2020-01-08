package gov.amc.siga.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import gov.amc.siga.dao.ProjetoDao;
import gov.amc.siga.model.Projeto;

@Component
public class ProjetoBean implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private ProjetoDao projetodao;
	private Projeto projeto;
	
	
	
}
