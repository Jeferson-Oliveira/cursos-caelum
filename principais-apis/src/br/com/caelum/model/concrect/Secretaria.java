package br.com.caelum.model.concrect;

import br.com.caelum.model.abstrac.Funcionario;

public class Secretaria extends Funcionario{

	public Secretaria(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double getBonificacao() {
		return this.salario * 0.1;
	}

	
}
