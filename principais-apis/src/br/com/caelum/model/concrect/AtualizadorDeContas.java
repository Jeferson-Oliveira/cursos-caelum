package br.com.caelum.model.concrect;

import br.com.caelum.model.abstrac.Conta;

/**
 * Classe que atualiza a conta de acordo com a taxas selic
 * @author jefer
 *
 */
public class AtualizadorDeContas {
	private double totalDeSaldos;
	private double taxaSelic;
	
	public AtualizadorDeContas(double selic) {
		this.taxaSelic = selic;
	}
	
	/**
	 * Método que recebe como parâmetro uma conta e atualiza seu saldo de acordo coma a taxa selic
	 * @param c Conta a ser atualizada
	 */
	public void atualiza(Conta c){
		System.out.println("Saldo anterior:" + c.getSaldo());
		c.atualiza(taxaSelic);
		System.out.println("Saldo atual:" + c.getSaldo());
		this.totalDeSaldos += c.getSaldo();
	}
	
	public double getTotalDeSaldos(){
		return this.totalDeSaldos;
	}
}
