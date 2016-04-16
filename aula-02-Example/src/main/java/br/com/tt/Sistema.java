package br.com.tt;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class Sistema {
	
	public double calcularSalarioAnual = 0.0D;
		
	@Before
	public void testCalculaSalario() {

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Pedro");
		funcionario.setIdade(18);
		funcionario.setSalario(1500D);

		FuncionarioService funcionarioService = new FuncionarioService();
		calcularSalarioAnual = funcionarioService.CalcularSalarioAnual(funcionario.getSalario());
		funcionarioService.AvaliacaoSalarioAnual(calcularSalarioAnual);
	}
	
	@Test
	public void test() {
		assertTrue(18000.0 == calcularSalarioAnual);
	}

}
