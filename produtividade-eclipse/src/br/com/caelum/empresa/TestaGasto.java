package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class TestaGasto {
	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1997, 4, 23);
		Funcionario funcionario = new Funcionario("Jeferson", 1234, dataNascimento);
		Calendar hoje = Calendar.getInstance();
		Gasto gasto = new Gasto("Sorvete", "Alimentação", 7.0d, hoje, false);
		Gasto gasto2 = new Gasto("Sorvete", "Alimentação", 7.0d, hoje, false);
		Gasto gasto3 = new Gasto("Sorvete", "Alimentação", 7.0d, hoje, false);
		Gasto gasto4 = new Gasto("Sorvete", "Alimentação", 7.0d, hoje, false);
	
		System.out.println(gasto);
		System.out.println(gasto2);
		System.out.println(gasto3);
		System.out.println(gasto4);
	}
}
