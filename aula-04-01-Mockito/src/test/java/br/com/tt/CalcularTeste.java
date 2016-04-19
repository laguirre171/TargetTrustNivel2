package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

import static org.mockito.Mockito.*;

public class CalcularTeste {

	@Test
	public void test() {
		Calcular calcular = spy(new Calcular()); //
		//Calcular calcular = mock(Calcular.class);
		when(calcular.getVal1()).thenReturn(4); //palavra reservada do mockito
		when(calcular.getVal2()).thenReturn(2); //palavra reservada do mockito
		assertTrue(6==calcular.somar());		
		//Assert.assertEquals(new Integer(6),calcular.somar());
	}

}
