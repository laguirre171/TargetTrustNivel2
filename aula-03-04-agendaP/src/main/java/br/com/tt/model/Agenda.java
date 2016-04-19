package br.com.tt.model;

public class Agenda {

	private String nome;
	private String telefone;
	private String email;
	private String nomeFake;
	private char sexo;
	private Double nota;
	private Boolean colega;

	public Agenda() {
		super();
	}

	public Agenda(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public Agenda(String nome, String telefone, String email, String nomeFake, char sexo, Double nota) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.nomeFake = nomeFake;
		this.sexo = sexo;
		this.nota = nota;
	}

	public Agenda(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeFake() {
		return nomeFake;
	}

	public void setNomeFake(String nomeFake) {
		this.nomeFake = nomeFake;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public Boolean getColega() {
		return colega;
	}

	public void setColega(Boolean colega) {
		this.colega = colega;
	}
	
	

}
