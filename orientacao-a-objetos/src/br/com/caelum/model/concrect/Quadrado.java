package br.com.caelum.model.concrect;

import br.com.caelum.model.contracts.AreaCalculavel;

public class Quadrado implements AreaCalculavel {
	private Double lado;
	
	public Quadrado(Double lado) {
		this.lado = lado;
	}
	
	@Override
	public Double calculaArea() {
		return Math.pow(this.lado, 2);
	}

}
