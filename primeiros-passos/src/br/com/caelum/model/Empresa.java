package br.com.caelum.model;

public class Empresa {
	private String nome;
	private String cnpj;
	private int contador = 0;
	private Funcionario[] funcionarios;
	
	
	public Empresa(String nome, String cnpj , int quantidadeDeFuncionarios) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = new Funcionario[quantidadeDeFuncionarios];
	}
	
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
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void adicionaFuncionario(Funcionario funcionario){
		this.funcionarios[contador] = funcionario;
		contador++;
	}
	/**
	 * @param funcionarios the funcionarios to set
	 */
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public Funcionario getFuncionario(int index){
		return funcionarios[index];  
	}
	
	public void mostrarDadosEmpresa(){
		System.out.println("Nome da empresa: " + this.nome);
		System.out.println("CNPJ : " + this.cnpj);
		System.out.println("Dados dos funcionários:");
		
		for(int i = 0;i < this.funcionarios.length;i++){
			this.funcionarios[i].mostrarDados();
		}
	}


	
}
