package br.com.tt.exception;

public class SistemaException extends Exception{

	private static final long serialVersionUID = 1L;

	public SistemaException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public SistemaException(String arg0) {
		super(arg0);
		
	}
	

}
