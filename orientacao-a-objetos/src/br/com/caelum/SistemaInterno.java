package br.com.caelum;

import br.com.caelum.model.contracts.Autenticavel;

public class SistemaInterno {
	private Integer senha;
	
	public void login(Autenticavel autenticavel){
		if(autenticavel.autentica(this.senha)){
			System.out.println("Bem vindo");
		}else{
			System.out.println("Falha na autenticação");
		}
	}
}
