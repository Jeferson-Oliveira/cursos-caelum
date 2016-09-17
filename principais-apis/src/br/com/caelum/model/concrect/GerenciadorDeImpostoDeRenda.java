package br.com.caelum.model.concrect;

import br.com.caelum.model.contracts.Tributavel;

public class GerenciadorDeImpostoDeRenda {
	private Double total = 0d;

	public void adiciona(Tributavel t){
		System.out.println("Adicionando tributos de: " + t);
		this.total += t.calcularTributo();
	}
	
	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}
	
	
}
