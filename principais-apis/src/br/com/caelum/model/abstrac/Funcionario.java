package br.com.caelum.model.abstrac;

import java.util.Date;

public abstract class Funcionario {
	
	protected String nome;
	protected String rg;
	protected Date dataDeContratacao;
	protected Integer idade;
	protected Double salario;
	
	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
		this.dataDeContratacao = new Date();
	}

	public abstract Double getBonificacao();
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the dataDeContratacao
	 */
	public Date getDataDeContratacao() {
		return dataDeContratacao;
	}

	/**
	 * @param dataDeContratacao the dataDeContratacao to set
	 */
	public void setDataDeContratacao(Date dataDeContratacao) {
		this.dataDeContratacao = dataDeContratacao;
	}

	/**
	 * @return the idade
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/**
	 * @return the salario
	 */
	public Double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
