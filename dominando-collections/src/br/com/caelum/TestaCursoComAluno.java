package br.com.caelum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import br.com.caelum.model.concrets.Aluno;
import br.com.caelum.model.concrets.Aula;
import br.com.caelum.model.concrets.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Dominando Collections", "Carlos");
		curso.setAulas(
				Arrays.asList(
						new Aula("Maps", 20),
						new Aula("Retomando arraylist", 20),
						new Aula("Boas Práticas",10),
						new Aula("Relacionamento de collections", 20),
						new Aula("O poder dos Sets", 40)
						));
		
		curso.matricular(
						new Aluno("Jeferson", 1234),
						new Aluno("Carlos", 4567),
						new Aluno("Felipe",9101),
						new Aluno("Aline",5544),
						new Aluno("Lucas", 4567)// Não vai adicionar
						);
		System.out.println(curso.estaMatriculado(new Aluno("Felipe", 9101)));
	
		// o TreeSet ordena os elementos pela ordem natural deles, por tanto o java precisa saber a ordem os objetos
		// Isso é feito tendo um contrato na classe Aluno para comparar ou Adicionando um contrado no momento da criação 
		Set<Aluno> alunosMutaveis = new TreeSet<>(new Comparator<Aluno>() {
			@Override
			public int compare(Aluno a1, Aluno a2) {
				return a1.getNumeroMatricula().compareTo(a2.getNumeroMatricula());
			}
		});
		alunosMutaveis.addAll(curso.getAlunos());
		
		// Iterando uma Collection da forma antiga
		Iterator<Aluno> iterator = alunosMutaveis.iterator();
		while (iterator.hasNext()) {
			Aluno aluno = iterator.next();
			System.out.println(aluno);
		}

	}

}
