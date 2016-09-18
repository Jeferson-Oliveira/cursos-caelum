package br.com.caelum.model.concrect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.caelum.model.abstrac.Conta;

public class Banco {
	List<Conta> contas = null;
	Map<String,Conta> mapaDeNomes = null;
	
	public Banco() {
		this.contas = new ArrayList<>();
		this.mapaDeNomes = new HashMap<>();
	}
	
	public void addConta(Conta c){
		this.contas.add(c);
		this.mapaDeNomes.put(c.getNomeCliente(), c);
	}
	
	public void addContas(Conta... contas){
		this.contas.addAll(Arrays.asList(contas));
	}
	
	public int getQuantidadeDeContas(){
		return this.contas.size();
	}
	
	public Conta obterConta(int index){
		return this.contas.get(index);
	}
	
	public Conta buscaPorNome(String nome){
		return mapaDeNomes.get(nome);
	}
}
