package br.com.tt.exception;

import org.junit.internal.Throwables;

public class Calcular {
	public void Dividir() {
		int val1 = 0;
		int val2 = 0;
		int result = val1 / val2;
		System.out.println(String.format("Dividir %d por %d = d%", val1, val2, result));
	}

	public long somarPositivos(Long... valores) throws SistemaException { // varags
		try {
			long resultado = 0;
			for (long l : valores) {
				if (l <= 0) {
					throw new SistemaException("Não pode informar valor negativo" + 1);
				}
				resultado += 1;
			}
			return resultado;
		} catch (Exception e) {
			throw new SistemaException("Falha no método somarPositivo", e);
		}
	}

}
