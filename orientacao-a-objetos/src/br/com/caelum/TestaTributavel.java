package br.com.caelum;

import br.com.caelum.model.concrect.ContaCorrente;
import br.com.caelum.model.concrect.GerenciadorDeImpostoDeRenda;
import br.com.caelum.model.concrect.SeguroDeVida;
import br.com.caelum.model.contracts.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calcularTributo());
		// cc = referência de Conta Corrente
		
		Tributavel sv = new SeguroDeVida();
		System.out.println(sv.calcularTributo());
		
		Tributavel tb = cc;
		System.out.println(tb.calcularTributo());
		// tb  = referência de Conta Corrente
		GerenciadorDeImpostoDeRenda gir = new GerenciadorDeImpostoDeRenda();
		
		gir.adiciona(cc);
		gir.adiciona(sv);
		gir.adiciona(tb);
		
		System.out.println("Total tirbutos: " + gir.getTotal());
	}

}
