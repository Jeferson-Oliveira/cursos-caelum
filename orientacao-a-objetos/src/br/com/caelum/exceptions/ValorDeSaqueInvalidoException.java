package br.com.caelum.exceptions;

public class ValorDeSaqueInvalidoException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1002823324943651173L;

	public ValorDeSaqueInvalidoException(double valor) {
		super("Valor de saque inválido: " + valor);
	}
}
