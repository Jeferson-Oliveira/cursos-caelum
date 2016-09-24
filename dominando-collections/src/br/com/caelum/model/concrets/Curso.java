package br.com.caelum.model.concrets;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new HashSet<>(); // new LinkedHashSet(); caso queira que os itens sejam agrupados por ordem de inser��o
	private HashMap<Integer, Aluno> alunoMatricula = new HashMap<>();
	
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
	
	public void matricular(Aluno aluno){
		if(aluno.getNumeroMatricula() == null){
			throw new IllegalArgumentException("N�mero de matr�cula inv�lido");
		}
		this.alunos.add(aluno);
		this.alunoMatricula.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public void matricular(Collection<Aluno> alunos){
		alunos.forEach(aluno -> {
			this.matricular(aluno);
		});
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
		// � retornada uma c�pia da lista com permiss�o somente para leitura
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public Integer getTempoTotal(){
		Integer tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	public Aluno buscarPorMatricula(Integer matricula){
		return this.alunoMatricula.get(matricula);
	}
	
	public Boolean estaMatriculado(Aluno aluno){
		return this.alunos.contains(aluno);
	} 
	
	public String toString(){
	    return "[Curso: " + this.nome + ", Tempo: " + this.getTempoTotal()+"]";
	}
}
