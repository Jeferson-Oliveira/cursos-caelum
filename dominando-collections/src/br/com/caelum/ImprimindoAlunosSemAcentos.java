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
        alunos.add("Paulo"); /// não suporta itens duplicados
       alunos.forEach(aluno -> {
           System.out.println(aluno); // Não garante a ordem de inserção
       });

	}

}
