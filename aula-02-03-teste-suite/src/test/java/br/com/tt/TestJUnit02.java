package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit02 {
String nome = "Carlos Santos";
MensagemUtil mensagemUtil = new MensagemUtil(nome);

@Test
public void testSaudacaoMensagem(){
	assertEquals("Teste Saudacao", "Ola" + nome, mensagemUtil.saudacaoMensagem());
}

}
