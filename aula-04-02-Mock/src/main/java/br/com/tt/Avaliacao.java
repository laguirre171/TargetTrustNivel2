package br.com.tt;

public class Avaliacao {
	private static final String REPROVADO = "Reprovado";
	private static final String RECUPERA��O = "Recupera��o";
	private static final String APROVADO = "Aprovado";
	String retorno = " ";

	public String avaliar(Estudante aluno) {
		if (aluno.getNotaProva() >= 7) {
			if (aluno.getNotaTrabalho() >= 7) {
				retorno = APROVADO;
			} else {
				retorno = RECUPERA��O;
			}
		}else{
			retorno = REPROVADO;
		}
		return retorno;
	}

}
