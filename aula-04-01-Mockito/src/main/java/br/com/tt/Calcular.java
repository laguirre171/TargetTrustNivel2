package br.com.tt;

public class Calcular {
	private Integer val1;
	private Integer val2;
	
	public int somar(){
		//return val1 + val2;
		return this.getVal1() + this.getVal2();
	}

	public Integer getVal1() {
		return val1;
	}

	public void setVal1(Integer val1) {
		this.val1 = val1;
	}

	public Integer getVal2() {
		return val2;
	}

	public void setVal2(Integer val2) {
		this.val2 = val2;
	}
	
	

}
