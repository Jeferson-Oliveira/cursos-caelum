package br.com.caelum;

import br.com.caelum.model.Empresa;
import br.com.caelum.model.Funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa capgemini = new Empresa("Capgemini", "444.888.444-77", 30);

		capgemini.adicionaFuncionario(new Funcionario("Jeferson", 1300d));
		capgemini.adicionaFuncionario(new Funcionario("Rodrigo", 1500d));
		capgemini.adicionaFuncionario(new Funcionario("Willian", 1300d));
		capgemini.adicionaFuncionario(new Funcionario("Carlos", 1500d));
		capgemini.adicionaFuncionario(new Funcionario("Rafael", 1300d));
		capgemini.adicionaFuncionario(new Funcionario("Pedro", 1500d));
		
		capgemini.mostrarDadosEmpresa();
	}

}
