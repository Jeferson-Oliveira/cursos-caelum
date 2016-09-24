package br.com.caelum;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");    
        alunos.add("Paulo"); /// n�o suporta itens duplicados
       alunos.forEach(aluno -> {
           System.out.println(aluno); // N�o garante a ordem de inser��o
       });

	}

}
