package br.com.caelum.doc.br.com.caelum.model.concrect;

public class BarraDeProgresso implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 100; i++){
			System.out.println("Barrinha");
		}
		
	}

}
