package br.com.caelum.model.concrect;

import br.com.caelum.model.abstrac.Conta;

public class AtualizadorDeContas {
	private double totalDeSaldos;
	private double taxaSelic;
	
	public AtualizadorDeContas(double selic) {
		this.taxaSelic = selic;
	}
	
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
