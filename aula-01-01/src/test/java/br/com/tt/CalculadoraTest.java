package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		int val1 = 2;
		int val2 = 2;
		
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.somar(val1, val2);
		Assert.assertEquals(4, soma);	
		
	}
	
	@Test
	public void testDividir() {
		int val1 = 4;
		int val2 = 2;
		
		Calculadora calculadora = new Calculadora();
		int dividir = calculadora.dividir(val1, val2);
		Assert.assertEquals(2, dividir);
	}

}
