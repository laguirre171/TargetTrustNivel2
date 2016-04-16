package br.com.tt;

public class FuncionarioService {
	
	//Funcionario funcionario = new Funcionario();
	
	public double CalcularSalarioAnual(double salario){
		System.out.println("Salario Anual: " + (salario * 12));		
		return salario * 12;
	}
	
	public double AvaliacaoSalarioAnual(double salario){
		
		if (salario < 10000){
			System.out.println("Salario Bônus: " + (salario + 500));
			return salario + 500;	
			
		}else{			
			System.out.println("Salario Bônus: " + (salario + 1000));
			return salario + 1000;
		}
	}
	
	

}
