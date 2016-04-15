package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestJUnit01 {
	String nome = "Marcia Maria dos Santos";
	MensagemUtil mensagemUtil = new MensagemUtil(nome);
	
	@Test
	public void testMostraMensagem(){
		assertEquals("Teste Mostra Mensagem", nome, mensagemUtil.MostrarMensagem());
	}
	/*
	@Test
	public void testMostraMensagem2(){
		assertEquals("Teste Mostra Mensagem", "aaa", mensagemUtil.MostrarMensagem());
	}*/

}
