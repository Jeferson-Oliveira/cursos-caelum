package br.com.caelum.model.concrets;

public class Aluno {
	private String nome;
	private Integer numeroMatricula;
	
	
	public Aluno(String nome, Integer numeroMatricula) {
		super();
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matricula: " + this.numeroMatricula + "]"; 
	}
}
