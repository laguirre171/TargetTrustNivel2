package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcularTest {

	@Test(expected  = ArithmeticException.class)
	public void testDividir() {
		
		new Calcular().Dividir();
		//Calcular calcular = new Calcular();
	}

}
