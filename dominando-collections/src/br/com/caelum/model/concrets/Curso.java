package br.com.caelum.model.concrets;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	public String getNome() {
		return nome;
	}
	
	public void setAula(Aula aula){
		this.aulas.add(aula);
	}
	
	public Aula getAula(Integer index){
		return this.aulas.get(index);
	}
	
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	public List<Aula> getAulas() {
		// é retornada uma cópia da lista com permissão somente para leitura
		return Collections.unmodifiableList(aulas);
	}
	
}
