package br.com.caelum.model.concrect;

public class Programa implements Runnable{
	
	private Integer id;
	
	public Programa(Integer id) {
		this.id = id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 100;i++ ){
			System.out.println("Programa :" + this.id +"valor: " + i);
		}
	}
}
