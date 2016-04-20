package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;


public class CalcularTest {
	
	private Calcular calcular;
	
	@Before
	public void inicializar(){
		calcular = new Calcular();
	}
	
	@Dado("^o primeiro valor sendo \"([^\"]*)\" e o segundo valor \"([^\"]*)\"$")
	public void o_primeiro_valor_sendo_e_o_segundo_valor(Integer v1, Integer v2) throws Throwable {
		calcular.setValor1(v1);
		calcular.setValor2(v2);
	}

	@Quando("^eu realizo a soma$")
	public void eu_realizo_a_soma() throws Throwable {
		calcular.somar();
	}

	@Entao("^o resultado da soma ? \"([^\"]*)\"$")
	public void o_resultado_da_soma(Integer resultado) throws Throwable {
		Assert.assertEquals(resultado, calcular.getResultado());
	}

}
