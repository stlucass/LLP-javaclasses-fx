package exercicio5;

public class Pessoa {
	private String sexo;
	private int idade;
	private String nome;

	public Pessoa(String sexo, int idade, String nome) {
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

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private String getSexo() {
		return sexo;
	}

	private void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
