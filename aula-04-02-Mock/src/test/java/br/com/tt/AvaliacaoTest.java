package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class AvaliacaoTest {

	@Test
	public void testAvaliar() {
		Avaliacao avaliacao = new Avaliacao();
		
		//MOCK
		Estudante aluno = mock(Estudante.class);
		when(aluno.getNotaProva()).thenReturn(8D);
		when(aluno.getNotaTrabalho()).thenReturn(7D);				
		
		String resultado = avaliacao.avaliar(aluno);
		assertEquals("Aprovado",resultado);		
	}

}
