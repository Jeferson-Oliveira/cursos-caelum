package br.com.caelum;

import br.com.caelum.model.abstrac.Conta;
import br.com.caelum.model.concrect.AtualizadorDeContas;
import br.com.caelum.model.concrect.ContaCorrente;
import br.com.caelum.model.concrect.ContaPoupanca;

public class TestarAtualizadorDeContas {

    public static void main(String[] args) {
     
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.deposita(1000); 
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

    
        adc.atualiza(cc);
        adc.atualiza(cp);

        System.out.println("Saldo Total: " + adc.getTotalDeSaldos());
    }

}