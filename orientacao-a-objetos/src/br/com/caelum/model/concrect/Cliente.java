package br.com.caelum.model.concrect;

import br.com.caelum.model.contracts.Autenticavel;

public class Cliente implements Autenticavel{
	private Integer senha;
	
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
