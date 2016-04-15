package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteJUnit {
	
	@Test
	public void teste(){
		String str = "Meu JUnit";
		assertEquals("Meu JUnit",str);
	}
	
	@Test
	public void teste2(){
		String str = "Meu JUnit";
		assertEquals("meu junit",str);
	}

}
