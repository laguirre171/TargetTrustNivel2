package br.com.tt;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Teste extends TestCase{
	protected double valor1;
	protected double valor2;
	
	@Before
	protected void setUp(){
		valor1 = 2.0;
		valor2 = 3.0;		
	}
	
	@Test
	public void teste(){
		assertTrue(5.0 == (valor1 + valor2));	
		int qtd = this.countTestCases();
		System.out.println("Quantidade de Testes " + qtd);
		
		this.setName("novoTesteOutroNome");
		String name = this.getName();
		System.out.println("Nome do Teste: " + name);
		
		this.setName("novoTesteOutroNome");
		name = this.getName();
		System.out.println("Nome do Teste: " + name);		
		
	}
	
	@Test
	public void teste2(){
		assertTrue(true);
	}

}
