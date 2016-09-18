package br.com.caelum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.caelum.model.abstrac.Conta;
import br.com.caelum.model.concrect.ContaCorrente;

public class TestaColetions {
	public static void main(String[] args) {
		// Ordenação
		Conta c1 = new ContaCorrente();
		c1.setNumero(1);
		Conta c2 = new ContaCorrente();
		c2.setNumero(2);
		Conta c3 = new ContaCorrente();
		c3.setNumero(3);
		Conta c4 = new ContaCorrente();
		c4.setNumero(4);
		
		List<Conta> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		System.out.println(contas);
		// inverte
		Collections.reverse(contas);
		System.out.println(contas);
		// ordena
		Collections.sort(contas);
		System.out.println(contas);
		//troca posição
		Collections.swap(contas, 0, 3);
		System.out.println(contas);
		//embaralha
		Collections.shuffle(contas);
		System.out.println(contas);
		//rotaciona
		Collections.rotate(contas, 1);
		System.out.println(contas);
		
		Set<Conta> contasHas = new HashSet<>();
		contasHas.add(c1);
		contasHas.add(c2);
		contasHas.add(c3);
		contasHas.add(c1);
		
		System.out.println(contasHas.size());
		
		TreeSet<Integer> numerosTree = new TreeSet<>();
		for(int i = 0;i < 100 ; i++){
			numerosTree.add(i);
		}
		System.out.println(numerosTree);
		for (Integer i : numerosTree.descendingSet()) {
			System.out.print(i + " ");
		}
		
		
		
	}
}
