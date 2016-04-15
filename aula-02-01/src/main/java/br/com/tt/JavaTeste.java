package br.com.tt;

import junit.framework.TestCase;

public class JavaTeste extends TestCase{
	
	protected int valor1, valor2;
	
	/****
	protected void setUp(){
		valor1 = 3;
		valor2 = 3;
	}
	*****/
	
	protected void altera(){
		valor1 = 3;
		valor2 = 3;
	}
	
	public void testMeuTesteAltera(){
		altera();
		assertTrue(6 == valor1 + valor2);	
	}
	
	public void testMeuTeste(){
		assertTrue(6 == valor1 + valor2);	
	}
	
	public void testMeuTeste2(){
		assertTrue(0 == valor1 + valor2);	
	}
	
	public void testMeuTeste3(){
		assertTrue(1 == valor1 / valor2);	
	}
	
}
