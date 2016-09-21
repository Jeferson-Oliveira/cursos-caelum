package br.com.caelum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.caelum.model.concrets.Aula;

public class TestaComparable {

	public static void main(String[] args) {
		List<Aula> aulas = new ArrayList<>();
		aulas.addAll(Arrays.asList(
				new Aula("Conhecendo ArrayList",30),
				new Aula("Relacionamento de Cole��es", 24),
				new Aula("Analise de LinkedList", 50)
				)
			);
		
		//Ordena pela condi��o padr�o feita na classe Aula
		Collections.sort(aulas);
		System.out.println(aulas);
		// Ordena Usando um Comparator customizado
		Collections.sort(aulas, (Aula a1, Aula a2) -> {
			return a1.getTempo().compareTo(a2.getTempo());
		});
		System.out.println(aulas);
		
		//Ordena Usando uma funci��o 
		Collections.sort(aulas, Comparator.comparing(Aula::getTitulo));
		System.out.println(aulas);
	}

}
