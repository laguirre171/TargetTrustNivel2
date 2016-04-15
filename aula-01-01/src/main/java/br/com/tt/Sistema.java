package br.com.tt;

import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) {
		Caixa caixa = new Caixa();
		ArrayList<Compra> compras = new ArrayList<Compra>();
		compras.add(new Compra());
		compras.get(compras.size()-1).setProduto("celular");
		compras.get(compras.size()-1).setValor(500D);
		caixa.calcular(compras);
		System.out.println("Resultado da maior Compra: " + caixa.getMaiorCompra());
	}

}
