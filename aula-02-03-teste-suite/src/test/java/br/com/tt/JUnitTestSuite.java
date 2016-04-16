package br.com.tt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestJUnit01.class, TestJUnit02.class })
public class JUnitTestSuite {
	
	
	@Test
	public void teste(){
		//int qtd = this.countTestCases();
		//System.out.println("Quantidade de Testes " + qtd);	
		
	}

}
