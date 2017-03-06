package br.com.caelum.livraria.util;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import br.com.caelum.livraria.modelo.Usuario;

public class Autorizador implements PhaseListener{

	@Override
	public void afterPhase(PhaseEvent arg0) {
		FacesContext context = FacesContext.getCurrentInstance();
		String nomePagina = context.getViewRoot().getViewId();
		if("/login.xhtml".equals(nomePagina)){
			return;
		}
		
		Usuario user = (Usuario)context.getExternalContext().getSessionMap().get("usuario");
		if(user != null){
			return;
		}
		
		NavigationHandler handler = context.getApplication().getNavigationHandler();
		handler.handleNavigation(context, null, new RedirectView("login").toString());
		context.renderResponse();
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {
		
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

}
