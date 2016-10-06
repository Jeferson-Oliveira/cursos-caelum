package br.com.caelum.empresa.modelo;

import java.util.Calendar;

public class Gasto {
	private String nome;
	private String tipo;
	private Double valor;
	private Calendar dia;
	private boolean pagoEmDinheiro;
	
	public Gasto(String nome, String tipo, Double valor, Calendar dia, boolean pagoEmDinheiro) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.valor = valor;
		this.dia = dia;
		this.pagoEmDinheiro = pagoEmDinheiro;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public Calendar getDia() {
		return dia;
	}


	public void setDia(Calendar dia) {
		this.dia = dia;
	}
	

	public boolean isPagoEmDinheiro() {
		return pagoEmDinheiro;
	}

	public void setPagoEmDinheiro(boolean pagoEmDinheiro) {
		this.pagoEmDinheiro = pagoEmDinheiro;
	}

	@Override
	public String toString() {
		return this.nome + " " + this.tipo + " " + this.valor + " " + this.dia;
	}
	
	
}
