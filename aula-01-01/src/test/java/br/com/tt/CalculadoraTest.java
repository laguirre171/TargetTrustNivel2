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
	public void testDividirInteirosIguais() {
		Double val1 = 2D;
		Double val2 = 2D;

		Calculadora calculadora = new Calculadora();
		Double dividir = calculadora.dividir(val1, val2);
		Assert.assertEquals(new Double(1), new Double(dividir));
	}

	@Test
	public void testDividirPrimeiroValorMenor() {
		Double val1 = 1D;
		Double val2 = 4D;

		Calculadora calculadora = new Calculadora();
		assertEquals(new Double(0.25), new Double(calculadora.dividir(val1, val2)));
	}

	@Test
	public void testDividirSegundoMenor() {

		Calculadora calculadora = new Calculadora();
		assertEquals(new Double(2.5), new Double(calculadora.dividir(5D, 2D)));
	}
	
	@Test
	public void testDividirSegundoZero() {
		
		assertTrue(new Calculadora().dividir(5D, 0D).isInfinite());
	}
	
	@Test
	public void testDividirPrimeiroZero() {
		
		assertEquals(new Double(0), new Calculadora().dividir(0D, 5D));
	}
	
	
	@Test
	public void testDividirPrimeiroNull() {
		
		assertEquals(new Double(0), new Calculadora().dividir(null, 5D));
	}
	
	@Test
	public void testDividirSegundoNull() {
		
		assertTrue(new Calculadora().dividir(5D, null).isInfinite());
	}
	

	@Test
	public void testDividirDoisNull() {	
		assertEquals(new Double(0), new Calculadora().dividir(null, null));
	}
	
	@Test (expected = NumberFormatException.class)
	public void testDividirString() {	
		assertEquals(new Double(0), new Calculadora().dividir(new Double("AAA"), null));
	}
	
}
