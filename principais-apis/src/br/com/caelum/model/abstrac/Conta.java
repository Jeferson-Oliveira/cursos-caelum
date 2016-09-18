package br.com.caelum.model.abstrac;

import br.com.caelum.exceptions.ValorDeSaqueInvalidoException;
import br.com.caelum.model.concrect.ContaCorrente;

/**
 * Classe abastrata que representa uma Conta
 * @author jefer
 *
 */
public abstract class Conta implements Comparable<Conta>{
	
	protected String nomeCliente;
	protected double saldo;
	protected Integer agencia;
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
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	

	
	@Override
	public int compareTo(Conta o) {
		if(this.getNumero() < o.getNumero()) return -1;
		if(this.getNumero() > o.getNumero()) return 1;
		return 0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (nomeCliente == null) {
			if (other.nomeCliente != null)
				return false;
		} else if (!nomeCliente.equals(other.nomeCliente))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "número: " + this.numero;
	}

}
