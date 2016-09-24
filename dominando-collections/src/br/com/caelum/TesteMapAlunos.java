package br.com.caelum;

import java.util.Arrays;
import java.util.Scanner;

import br.com.caelum.model.concrets.Aluno;
import br.com.caelum.model.concrets.Aula;
import br.com.caelum.model.concrets.Curso;

public class TesteMapAlunos {

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
		
		curso.matricular(Arrays.asList(
						new Aluno("Jeferson", 1234),
						new Aluno("Carlos", 4567),
						new Aluno("Felipe",9101),
						new Aluno("Aline",5544)
						));
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número de matrícula para pesquisar:");
		Integer matriculaPesquisada = entrada.nextInt();
		entrada.close();
		System.out.println("Aluno da matricula: " + matriculaPesquisada);
		System.out.println(curso.buscarPorMatricula(matriculaPesquisada));
		
	}

}
