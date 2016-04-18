package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.tt.exception.Calcular;
import br.com.tt.exception.SistemaException;

public class CalcularTest {

	@Test(expected  = ArithmeticException.class)
	public void testDividir() {
		
		new Calcular().Dividir();
		//Calcular calcular = new Calcular();
	}
	
	@Test
	public void testSomarPositivos() throws SistemaException{
		new Calcular().somarPositivos(1L,2L,3L,4L);
	}
	
	@Test(expected = SistemaException.class )
	public void passandoValorNegativo() throws SistemaException{
		new Calcular().somarPositivos(1L,-2L,3L,4L);
	}
	
	@Test
	public void testSomarPositivosPassandoSemValor() throws SistemaException{
		new Calcular().somarPositivos();
	}
	
	@Test(expected = SistemaException.class )
	public void testSomarPositivosPassandoNull() throws SistemaException{
		new Calcular().somarPositivos(1L,null,3L,4L);
	}

}
