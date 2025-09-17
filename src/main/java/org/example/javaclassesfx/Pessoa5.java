package org.example.javaclassesfx;

public class Pessoa5 {
	private String sexo;
	private int idade;
	private String nome;

	public Pessoa5(String sexo, int idade, String nome) {
		this.sexo = sexo;
		this.idade = idade;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
