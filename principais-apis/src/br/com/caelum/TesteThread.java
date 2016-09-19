package br.com.caelum;

import br.com.caelum.doc.br.com.caelum.model.concrect.BarraDeProgresso;
import br.com.caelum.doc.br.com.caelum.model.concrect.CopiadorDeArquivos;
import br.com.caelum.model.concrect.Programa;

public class TesteThread {

	public static void main(String[] args) {
		
		/*BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		CopiadorDeArquivos copiadorDeArquivos = new CopiadorDeArquivos();
		
		Thread threadBarra = new Thread(barraDeProgresso);
		Thread threadCopiador = new Thread(copiadorDeArquivos);
		
		threadBarra.start();
		threadCopiador.start();*/
		
		Thread t1 = new Thread(new Programa(1));
		Thread t2 = new Thread(new Programa(2));
		
		t1.start();
		t2.start();
		
	}

}
