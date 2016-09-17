package br.com.caelum.model;

import java.util.Calendar;

public class Funcionario {
	public String nome;
	public String departamento;
	public String RG;
	public Data dataDeEntrada;
	public double salario;
	public static int IDENTIFICADOR_PROXIMO = 0;
	
	
	public Funcionario() {
		this(null,0d);
	}
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		this.dataDeEntrada = new Data(Calendar.DAY_OF_MONTH,Calendar.MONTH, Calendar.YEAR);
		IDENTIFICADOR_PROXIMO++;
	}

	public void receberAumento(double valor){
		this.salario += valor;
	}
	
	public void calcularGanhoAnual(){
		System.out.println("Ganho anual"+ this.salario * 12);
	}
	
	public void mostrarDados(){
		System.out.println("Nome: " + this.nome);
		System.out.println("RG" + this.RG);
		System.out.println("Data de entrada: " + this.dataDeEntrada.toString());
		System.out.println("Salário: " + this.salario);
	}
}
