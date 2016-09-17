package br.com.caelum;

import br.com.caelum.model.concrect.Circulo;
import br.com.caelum.model.concrect.Quadrado;
import br.com.caelum.model.contracts.AreaCalculavel;

public class TestarFormaGeometrica {

	
	
	public static void main(String[] args) {
		AreaCalculavel quadrado = new Quadrado(10d);
		AreaCalculavel circulo = new Circulo(2d);
		
		System.out.println("Area do Circulo: " + circulo.calculaArea());
		System.out.println("Area do quadrado: " + quadrado.calculaArea());

	}

}
