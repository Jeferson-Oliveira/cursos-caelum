package br.com.caelum.model.abstrac;

import br.com.caelum.exceptions.ValorDeSaqueInvalidoException;

/**
 * Classe abastrata que representa uma Conta
 * @author jefer
 *
 */
public abstract class Conta {
	
	protected String nomeCliente;
	protected double saldo;
	protected int agencia;
	protected int numero;
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}
	
	public void saca(double valor){
		if(valor <= this.saldo && valor > 0){
			this.saldo -= valor;
		}else{
			throw new ValorDeSaqueInvalidoException(valor);
		}
	}
	public void deposita(double valor){
		if(valor > 0){
			this.saldo += valor;
		}else{
			throw new IllegalArgumentException("Valor para saque inválido");
		}
	}
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
