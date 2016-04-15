package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JavaTeste2 {
	private int valor1, valor2;
	
	@Before
	public void inicializa(){
		valor1 = 3;
		valor2 = 3;
		//INICIALIZA O BANCO DE DADOS
		//FAZ LEITURA DE ARQUIVO
		//CONFIGURA AS CLASSES
	}
	
	@Test //usa oq não está extendendo test
	public void tests(){
		assertTrue(6==valor1+valor2);		
	}
	
	

}
