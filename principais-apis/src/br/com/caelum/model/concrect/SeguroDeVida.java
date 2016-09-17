package br.com.caelum.model.concrect;

import br.com.caelum.model.contracts.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public Double calcularTributo() {
		return 42d;
	}

}
