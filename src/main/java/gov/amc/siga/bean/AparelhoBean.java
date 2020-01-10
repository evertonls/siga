package gov.amc.siga.bean;

import java.util.Iterator;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.UnselectEvent;
import org.springframework.stereotype.Component;

import gov.amc.siga.model.Aparelho;

@Component
public class AparelhoBean implements Iterable<Aparelho> {

	private List<Aparelho> aparelhos;

	public List<Aparelho> getAparelhos() {
		return aparelhos;
	}

	public void setAparelhos(List<Aparelho> aparelhos) {
		this.aparelhos = aparelhos;
	}

	public void onItemUnselect(UnselectEvent event) {
		FacesContext context = FacesContext.getCurrentInstance();

		FacesMessage msg = new FacesMessage();
		msg.setSummary("Item unselected: " + event.getObject().toString());
		msg.setSeverity(FacesMessage.SEVERITY_INFO);

		context.addMessage(null, msg);
	}

	@Override
	public Iterator<Aparelho> iterator() {
		return null;
	}

}
