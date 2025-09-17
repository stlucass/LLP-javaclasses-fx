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

	public void ensinar() {
		System.out.println(nome + " está ensinando.");
	}

	public void falar() {
		System.out.println(nome + " está falando.");
	}

	public void movimentar() {
		System.out.println(nome + " está movimentando.");
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
