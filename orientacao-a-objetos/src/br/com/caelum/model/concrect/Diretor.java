package br.com.caelum.model.concrect;

import br.com.caelum.model.abstrac.Funcionario;
import br.com.caelum.model.contracts.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel{
	
	private Integer senha;
	
	public Diretor(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double getBonificacao() {
		return this.salario * 0.30;
	}

	@Override
	public boolean autentica(Integer senha) {
		return this.senha.equals(senha);
	}

	/**
	 * @return the senha
	 */
	public Integer getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(Integer senha) {
		this.senha = senha;
	}

}
