package br.com.tt;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class AvaliacaoTest {

	@Test
	public void testAvaliarAlunoAprovado() {
		Avaliacao avaliacao = new Avaliacao();
		
		Estudante aluno = getAluno(8D, 7D);	//Alt + shift + m = cria um novo método a prtir de um código			
		
		String resultado = avaliacao.avaliar(aluno);
		assertEquals(Avaliacao.APROVADO, resultado);		
	}
	
	@Test
	public void testAvaliarAlunoReprovado() {
		Avaliacao avaliacao = new Avaliacao();
		
		Estudante aluno = getAluno(6D, 7D);	//Alt + shift + m = cria um novo método a prtir de um código			
		
		String resultado = avaliacao.avaliar(aluno);
		assertEquals(Avaliacao.REPROVADO, resultado);		
	}
	
	@Test
	public void testAvaliarAlunoRecuperacao() {
		Avaliacao avaliacao = new Avaliacao();
		
		Estudante aluno = getAluno(7D, 6D);	//Alt + shift + m = cria um novo método a prtir de um código			
		
		String resultado = avaliacao.avaliar(aluno);
		assertEquals(Avaliacao.RECUPERAÇÃO, resultado);		
	}
	
	@Test
	public void testAvaliarAlunoNull() {
		Avaliacao avaliacao = new Avaliacao();
		
		Estudante aluno = getAluno(null, 6D);	//Alt + shift + m = cria um novo método a prtir de um código			
		
		String resultado = avaliacao.avaliar(aluno);
		assertEquals("Avaliar prova null", Avaliacao.REPROVADO, resultado);		
	}
	
	@Test
	public void testAvaliarAlunoTrabalhoNull() {
		Avaliacao avaliacao = new Avaliacao();
		
		Estudante aluno = getAluno(7D, null);	//Alt + shift + m = cria um novo método a prtir de um código			
		
		String resultado = avaliacao.avaliar(aluno);
		assertEquals("Avaliar prova null", Avaliacao.RECUPERAÇÃO, resultado);		
	}
	
	@Test
	public void testAvaliarAlunoAllNull() {
		Avaliacao avaliacao = new Avaliacao();
		
		Estudante aluno = getAluno(null, null);	//Alt + shift + m = cria um novo método a prtir de um código			
		
		String resultado = avaliacao.avaliar(aluno);
		assertEquals("Avaliar prova null", Avaliacao.REPROVADO, resultado);		
	}
	
	/***
	@Test
	public void testAvaliarAlunoTexto() {
		Avaliacao avaliacao = new Avaliacao();
		
		Estudante aluno = getAluno("aaa", null);	//Alt + shift + m = cria um novo método a prtir de um código			
		
		String resultado = avaliacao.avaliar(aluno);
		assertEquals("Avaliar prova null", Avaliacao.RECUPERAÇÃO, resultado);		
	}**/

	private Estudante getAluno(Double prova, Double trabalho) {
		//MOCK
		Estudante aluno = mock(Estudante.class);
		when(aluno.getNotaProva()).thenReturn(prova);
		when(aluno.getNotaTrabalho()).thenReturn(trabalho);
		return aluno;
	}

}
