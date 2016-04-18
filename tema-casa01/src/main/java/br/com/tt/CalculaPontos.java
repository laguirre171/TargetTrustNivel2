package br.com.tt;

public class CalculaPontos {

	
	public Double calculaPontos(int idade, Double salario){
		if (idade > 40 && salario >= 1000){
			return salario + 50D;
		}else{
			return salario + 150D;
		}
	}
	
}
