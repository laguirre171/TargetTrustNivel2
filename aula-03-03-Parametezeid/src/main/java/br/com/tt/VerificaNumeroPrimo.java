package br.com.tt;

public class VerificaNumeroPrimo {
	
	public Boolean validar (final Integer numeroPrimo){
		
		for (int i = 2; i < (numeroPrimo/2); i++) {
			if (numeroPrimo % i == 0){
				return Boolean.FALSE;
			}			
		}		
		return Boolean.TRUE;
	}

}
