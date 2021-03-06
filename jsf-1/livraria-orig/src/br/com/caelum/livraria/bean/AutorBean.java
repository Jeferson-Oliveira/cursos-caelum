package br.com.caelum.livraria.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.util.RedirectView;

@ManagedBean
@ViewScoped
public class AutorBean {

	private Autor autor = new Autor();

	public Autor getAutor() {
		return autor;
	}

	public RedirectView gravar() {
		System.out.println("Gravando autor " + this.autor.getNome());

		if(this.autor.getId() == null){			
			new DAO<Autor>(Autor.class).adiciona(this.autor);
		}else{
			new DAO<Autor>(Autor.class).atualiza(this.autor);
		}
		this.autor = new Autor();
		
		return new RedirectView("livro");
	}
	
	public void remove(Autor autor){
		new DAO<Autor>(Autor.class).remove(autor);
	}
	
	public void carrega(Autor autor){
		this.autor = autor;
	}
	
	public List<Autor> getAutores(){
		return (List<Autor>) new DAO(Autor.class).listaTodos() ;
	}
	
	public void buscaPorId(){
		Integer id  = autor.getId();
		 this.autor = (Autor) new DAO(Autor.class).buscaPorId(id);
		 
		 if(autor == null){
			 this.autor = new Autor();
		 }
	}
	

	
}
