package br.com.caelum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.caelum.model.concrets.Aula;
import br.com.caelum.model.concrets.Curso;

public class TestaCurso {

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
		
		System.out.println(curso.getAulas());
		List<Aula> aulasMutaveis = new ArrayList<>(curso.getAulas());
		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);
		System.out.println(curso);
	}

}
