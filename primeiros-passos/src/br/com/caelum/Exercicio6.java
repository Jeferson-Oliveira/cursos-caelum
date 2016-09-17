package br.com.caelum;

public class Exercicio6 {

	public static void main(String[] args) {
		int numero = 0;
		int fatorial = 1;
		int i;
		while (numero <= 10) {

			if (numero == 0) {
				System.out.println("O fatorial de " + numero + " e :" + fatorial);
				numero++;
				continue;
			}

			for (i = 1; i <= numero; i++) {
				fatorial *= i;
			}

			System.out.println("O fatorial de " + numero + " e :" + fatorial);
			numero++;
			fatorial = 1;
		}
	}

}
