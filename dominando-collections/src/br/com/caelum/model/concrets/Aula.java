package br.com.caelum.model.concrets;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private Integer tempo;
	
	
	public Aula(String titulo, Integer tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public Integer getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.titulo + "Tempo: " + this.tempo;
	}
	
	@Override
	public int compareTo(Aula o) {
		
		return this.titulo.compareTo(o.titulo);
	}
}
