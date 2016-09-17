package br.com.caelum.model.concrect;

import br.com.caelum.model.contracts.AreaCalculavel;

public class Circulo implements AreaCalculavel {

	private Double raio;

	
	public Circulo(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public Double calculaArea() {
		return (Math.pow(this.raio, 2) * Math.PI);
	}

	/**
	 * @return the raio
	 */
	public Double getRaio() {
		return raio;
	}

	/**
	 * @param raio the raio to set
	 */
	public void setRaio(Double raio) {
		this.raio = raio;
	}

}
