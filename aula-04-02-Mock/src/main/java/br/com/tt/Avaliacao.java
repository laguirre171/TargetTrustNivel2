package br.com.tt;

public class Avaliacao {
	public static final String REPROVADO = "Reprovado";
	public static final String RECUPERAÇÃO = "Recuperação";
	public static final String APROVADO = "Aprovado";
	String retorno = " ";

	public String avaliar(Estudante aluno) {
		if (aluno.getNotaProva() !=null && aluno.getNotaProva() >= 7) {
			if (aluno.getNotaTrabalho()!= null && aluno.getNotaTrabalho() >= 7) {
				retorno = APROVADO;
			} else {
				retorno = RECUPERAÇÃO;
			}
		}else{
			retorno = REPROVADO;
		}
		return retorno;
	}

}
