package br.com.caelum;

public class TestaString {

	public static void main(String[] args) {
		
		// há uma troca de referências
		StringBuilder nome = new StringBuilder("Jeferson Oliveira");
		StringBuilder nomeCopia = nome;
		nome.append("Luiz");
		System.out.println(nome);
		System.out.println(nomeCopia);
		// Não há troca de referências
		String nomeString = "Jeferson Oliveira";
		String nomeCopiaString = nomeString;
	
		
		
		nomeString = "Luiz";
		System.out.println(nomeString);
		System.out.print(nomeCopiaString);
	}

}
