package br.com.caelum.model.concrect;

import br.com.caelum.model.abstrac.Conta;
import br.com.caelum.model.contracts.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{
	
	
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa * 2);
	}

	@Override
	public Double calcularTributo() {
		return this.getSaldo() * 0.1;
	}

}
