package br.com.tt;

public class Calculadora {
	public int somar(int val1, int val2){
		return val1 + val2;
	}
	
	public Double dividir(Double val1, Double val2){
		return val1==null ? 0: val1 / (val2 ==null ? 0: val2);
	}
}
