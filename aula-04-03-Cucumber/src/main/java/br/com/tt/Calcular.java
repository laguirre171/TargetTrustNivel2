package br.com.tt;

public class Calcular {
	
	private Integer valor1;
	private Integer valor2;
	private Integer resultado;
	
	public void setValor1(Integer v1) {
		this.valor1 = v1;
		
	}

	public void setValor2(Integer v2) {
		this.valor2 = v2;
		
	}

	public void somar() {
		resultado = valor1 + valor2;		
	}

	public Integer getResultado() {
		return resultado;
	}
	
	

}
