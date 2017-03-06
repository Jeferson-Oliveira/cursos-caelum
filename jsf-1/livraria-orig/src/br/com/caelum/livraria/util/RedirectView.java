package br.com.caelum.livraria.util;

public class RedirectView {
	
	private String viewName = null;

	public RedirectView(String viewName) {
		this.viewName = viewName;
	}
	
	@Override
	public String toString() {
		return this.viewName + "?faces-redirect=true";
	}
}
