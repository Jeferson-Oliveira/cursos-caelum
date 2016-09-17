package br.com.caelum;

public class BalancoTrimestral {
	public static void main(String[] args) {
		int gastosJaneiro = 1500;
		int gastosFevereiro = 2200;
		int gastosMarco = 1700;
		int gastoTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastoTrimestre/3;
		System.out.println("O Gasto timestral é R$: " + gastoTrimestre);
		System.out.println("Média Mensal R$: " + mediaMensal);
	}
}
;