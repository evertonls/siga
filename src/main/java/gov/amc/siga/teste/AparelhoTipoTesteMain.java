package gov.amc.siga.teste;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import gov.amc.siga.config.SpringJdbcConfiguration;
import gov.amc.siga.dao.AparelhoTipoDao;
import gov.amc.siga.model.AparelhoTipo;

@SpringBootApplication
public class AparelhoTipoTesteMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfiguration.class);
		AparelhoTipoDao aparelhoTipoDao = context.getBean(AparelhoTipoDao.class);
		
		System.out.println("Lista de Aparelhos: ");
		
		for(AparelhoTipo a : aparelhoTipoDao.listarTodos()) {
			System.out.println(a);
		}
		
		context.close();
	}
}
