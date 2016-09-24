package br.com.caelum;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TesteMap {

	public static void main(String[] args) {
		// Chave e Valor
		Map<Integer, String> pessoas = new HashMap<>();// LinkedHasMap caso deseje manter a ordem de inserção(pela chave)

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");
		pessoas.put(27, "Jeferson Oliveira");// Ao contrário do Sets que não adicionam, os Maps sobrescrevem o item com a chave semelhante
		
		System.out.println("Chaves:");
		//Buscando todas as chaves
        pessoas.keySet().forEach(key -> {
			System.out.println(key);
		});;
		System.out.println("Valores:");
		// buscando todos os valores
		pessoas.values().forEach(value ->{
			System.out.println(value);
		});
		
		// bucando Relações de chaves e valores
		for(Entry<Integer, String> relacionamento : pessoas.entrySet()){
			System.out.println("Chave: " + relacionamento.getKey() + " Valor: " + relacionamento.getValue());
		}
	}

}
