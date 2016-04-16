package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFuncionarioService {
	@Test
	public void testCalcularSalarioAnual() {

		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(3500D);
		FuncionarioService funcionarioService = new FuncionarioService();
		funcionarioService.setFuncionario(funcionario);
		Double salarioAnual = funcionarioService.calcularSalarioAnual();
		assertEquals(new Double(42000D), salarioAnual);
	}

	@Test
	public void avaliacaoSalario() {
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(3500D);
		FuncionarioService funcionarioService = new FuncionarioService();
		funcionarioService.setFuncionario(funcionario);
		Double avaliacao = funcionarioService.avaliacaoSalarial();
		assertEquals(new Double(500D), avaliacao);
	}

}
