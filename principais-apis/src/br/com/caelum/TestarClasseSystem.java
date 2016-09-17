package br.com.caelum;

import br.com.caelum.model.abstrac.Conta;
import br.com.caelum.model.concrect.ContaCorrente;
import br.com.caelum.model.concrect.ContaPoupanca;

public class TestarClasseSystem {
	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaPoupanca();
		Conta c3 = new ContaPoupanca();
		Conta c4 = new ContaPoupanca();
		
		Conta[] contas = new Conta[5];
		Conta[] contaCopia = new Conta[10];
		
		contas[0] = c1;
		contas[1] = c2;
		contas[2] = c3;
		contas[3] = c4;		
		
		// copia os dois elementos do primeito array para o segundo 
		System.arraycopy(contas, 0, contaCopia, 0, 2);
		
		System.out.println(System.getenv("Java_Home"));
			
		
		
	}
}
