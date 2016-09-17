package br.com.caelum.model.contracts;

/**
 * 
 * Interface que representa todo tipo de classe que pode ser altenticável
 * @author jefer
 *
 */
public interface Autenticavel {
	public  boolean autentica(Integer senha);
}
