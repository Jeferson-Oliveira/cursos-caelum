package br.com.caelum;

import java.util.Arrays;

import br.com.caelum.model.concrets.Aula;
import br.com.caelum.model.concrets.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Dominando Collections", "Carlos");
		curso1.setAulas(
				Arrays.asList(
						new Aula("Retomando arraylist", 20), 
						new Aula("Relacionamento de collections", 20),
						new Aula("O poder dos Sets", 40)
						));
		
		System.out.println(curso1.getAulas());
	}

}
