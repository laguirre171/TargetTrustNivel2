package br.com.tt;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.Assert;

import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class VerificaNumeroPrimoTest {

	private VerificaNumeroPrimo verificaNumeroPrimo;
	private Boolean valorEsperado;
	private Integer numero;

	public VerificaNumeroPrimoTest(Integer numero, Boolean valorEsperado) {
		super();
		this.numero = numero;
		this.valorEsperado = valorEsperado;
	}

	@Before
	public void inicializacaoPrimoTest() {
		verificaNumeroPrimo = new VerificaNumeroPrimo();
	}

	@Parameterized.Parameters
	public static Collection<Object[]> numerosPrimos() {
		//@formatter:off
		return Arrays.asList(new Object[][] { { 2, true }, 
											  { 6, false }, 
											  { 19, true }, 
											  { 22, false }, 
											  { 23, true } });
		//@formatter:on
	}

	@Test
	public void testValidar() {
		assertEquals(valorEsperado, verificaNumeroPrimo.validar(numero));
	}
	
	@Test
	public void test0() {
		System.out.println(valorEsperado + " - " + numero);
	}

}
