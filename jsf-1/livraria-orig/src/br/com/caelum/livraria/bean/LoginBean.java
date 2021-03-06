package br.com.caelum.livraria.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.caelum.livraria.dao.UsuarioDao;
import br.com.caelum.livraria.modelo.Usuario;
import br.com.caelum.livraria.util.RedirectView;

@ManagedBean
@ViewScoped
public class LoginBean {
	
	private Usuario usuario = new Usuario();
	
	public Usuario getUsuario() {
		return usuario;
	}

	public RedirectView efetuarLogin(){
		System.out.println("Efetuando login");
		
		 boolean existe = new UsuarioDao().existe(this.usuario);

		    if (existe) {
		    	FacesContext context = FacesContext.getCurrentInstance();
		    	context.getExternalContext().getSessionMap().put("usuario", this.usuario);
		        return new RedirectView("livro");
		    }
		
		FacesContext.getCurrentInstance().addMessage("usuario", new FacesMessage("Usu�rio n�o cadastrado"));
		return null;
	}
	
	public RedirectView loggout(){
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getSessionMap().remove("usuario");
		return new RedirectView("login");
	}
}
