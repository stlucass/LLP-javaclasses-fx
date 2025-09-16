package org.example.javaclassesfx;

public class CorpoCeleste {
	private String nome;
	private String posicao;
	private String velocidade_rotacao;

	public CorpoCeleste(String nome, String posicao, String velocidade_rotacao) {
		this.nome = nome;
		this.posicao = posicao;
		this.velocidade_rotacao = velocidade_rotacao;
	}

	public void entrar_em_orbita() {
		System.out.println(nome + " entrou em órbita na posição " + posicao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getVelocidade_rotacao() {
		return velocidade_rotacao;
	}

	public void setVelocidade_rotacao(String velocidade_rotacao) {
		this.velocidade_rotacao = velocidade_rotacao;
	}

}
