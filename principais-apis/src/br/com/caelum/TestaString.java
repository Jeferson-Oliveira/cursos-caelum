package br.com.caelum;

public class TestaString {

	public static void main(String[] args) {
		
		// h� uma troca de refer�ncias
		StringBuilder nome = new StringBuilder("Jeferson Oliveira");
		StringBuilder nomeCopia = nome;
		nome.append("Luiz");
		System.out.println(nome);
		System.out.println(nomeCopia);
		// N�o h� troca de refer�ncias
		String nomeString = "Jeferson Oliveira";
		String nomeCopiaString = nomeString;
	
		
		
		nomeString = "Luiz";
		System.out.println(nomeString);
		System.out.print(nomeCopiaString);
	}

}
