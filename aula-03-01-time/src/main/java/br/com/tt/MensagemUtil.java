package br.com.tt;

public class MensagemUtil {
	private String mensagem;
	
	public MensagemUtil(String mensagem){
		this.mensagem = mensagem;		
	}
	
	public void mostraMensagem() throws InterruptedException{
		System.out.println(mensagem);
		Thread.sleep(5000);
		System.out.println("Passou 1000 milisegundos");
	}
	
	

}
