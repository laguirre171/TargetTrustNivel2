package br.com.tt;

public class MensagemUtil {
	private String mensagem;
	
	public MensagemUtil(String mensagem){
		this.mensagem = mensagem;
	}
	
	public String MostrarMensagem(){
		return mensagem;		
	}
	
	public String saudacaoMensagem(){
		return "Ola " + mensagem;
	}
}
