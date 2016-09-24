package br.com.caelum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

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
				Arrays.asList(
						new Aluno("Jeferson", 1234),
						new Aluno("Carlos", 4567),
						new Aluno("Felipe",9101),
						new Aluno("Aline",5544)
						));
		
		System.out.println(curso.getAlunos());
		

	}

}
