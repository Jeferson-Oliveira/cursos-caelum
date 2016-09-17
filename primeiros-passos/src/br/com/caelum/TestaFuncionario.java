package br.com.caelum;

import br.com.caelum.model.Data;
import br.com.caelum.model.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "JEferson";
		funcionario.RG = "15.477.888-88";
		funcionario.dataDeEntrada = new Data(01, 02, 2016);
		funcionario.departamento = "BU Bradesco";
		funcionario.salario = 1300d;
		
		funcionario.receberAumento(22);
		
		funcionario.mostrarDados();
			

	}

}
