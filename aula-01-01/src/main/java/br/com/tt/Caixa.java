package br.com.tt;

import java.util.List;

public class Caixa {
	private Double maiorCompra = 0D;
	
	public void calcular(List<Compra> compras){
		for (Object compra : compras) {
			if(maiorCompra < ((Compra) compra).getValor()){
				maiorCompra = ((Compra) compra).getValor();
			}
		}
	}
	
	public Double getMaiorCompra(){
		return maiorCompra;
	}
}
