package br.com.tt;

import static org.junit.Assert.*; //metódos statiscos pode ser *

import org.junit.Assert;
import org.junit.Test;

public class Teste01 {
	
	@Test
	public void primeiroTeste(){
		fail();		
	}
	
	@Test
	public void somar(){
		
		int soma = 4 + 4;
		
		if (soma == 8){
			System.out.println("OK");
		}else{
			fail();
		}	
	}
	
	@Test
	public void somaCorretamente(){
		int soma = 4 + 4 ;
		Assert.assertEquals(8, soma);
	}

}
