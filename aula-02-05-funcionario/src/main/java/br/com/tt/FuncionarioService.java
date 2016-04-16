package br.com.tt;

public class FuncionarioService {

	private Funcionario funcionario;

	public Double avaliacaoSalarial() {

		return funcionario.getSalario() < 10000 ? 500D : 1000D;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;

	}

	public Double calcularSalarioAnual() {

		return funcionario.getSalario() * 12;
	}

}
