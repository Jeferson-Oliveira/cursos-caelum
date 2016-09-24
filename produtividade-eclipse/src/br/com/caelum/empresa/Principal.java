package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;

public class Principal {
	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1997, 04, 23);
		Funcionario funcionario = new Funcionario("Jeferson", 1234, dataNascimento);
		System.out.println(funcionario);
		
	}
}
