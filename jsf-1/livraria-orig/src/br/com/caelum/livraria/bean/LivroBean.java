package br.com.caelum.livraria.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.modelo.Livro;
import br.com.caelum.livraria.util.RedirectView;

@ManagedBean
@ViewScoped
public class LivroBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Livro livro = new Livro();
	private Integer autorId;
	
	public Livro getLivro() {
		return livro;
	}
	
	public void removeAutor(Autor autor){
		this.livro.removeAutor(autor);
	}
	
	public void remover(Livro livro){
		System.out.println("Removendo livro");
		new DAO(Livro.class).remove(livro);
	}
	
	public RedirectView formAutor(){
		return new RedirectView("autor"); 
	}
	
	public List<Autor>getAutores(){
		return ((List<Autor>) new DAO(Autor.class).listaTodos());
	}
	
	public List<Autor> getAutoresDoLivro(){
		return this.livro.getAutores();
	}

	public void gravarAutor(){
		Autor autor = (Autor)new DAO(Autor.class).buscaPorId(autorId);
		this.livro.adicionaAutor(autor);
	}
	
	public void gravar() {
		System.out.println("Gravando livro " + this.livro.getTitulo());

		if (livro.getAutores().isEmpty()) {
			FacesContext.getCurrentInstance().addMessage("",new FacesMessage("O livro precisa ter ao menos um autor"));
			return;
		}else{
			if(this.livro.getId() == null){
				new DAO<Livro>(Livro.class).adiciona(this.livro);			
			}else{
				new DAO<Livro>(Livro.class).atualiza(this.livro);
			}
			this.livro = new Livro();
		}
	}

	public List<Livro> getLivros(){
		return (List<Livro>) new DAO(Livro.class).listaTodos();
	}
	
	public void comecaComDigitoNove(FacesContext fc , UIComponent c , Object value){
		String valueString = value.toString();
		
		if(!valueString.startsWith("9")){
			throw new ValidatorException(new FacesMessage("Item deverá iniciar com 1"));
		}
	}
	
	public Integer getAutorId() {
		return autorId;
	}
	
	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
}
