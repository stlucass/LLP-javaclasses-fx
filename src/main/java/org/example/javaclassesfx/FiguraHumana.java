package org.example.javaclassesfx;

public class FiguraHumana {
	private String posicao_corporal;
	private String expressao_facial;
	private String nome;

	public FiguraHumana(String posicao_corporal, String expressao_facial, String nome) {
		this.setExpressao_facial(expressao_facial);
		this.setNome(nome);
		this.setPosicao_corporal(posicao_corporal);
	}

	public void carregar_fardo() {
		System.out.println(getNome() + " carregou fardo");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getExpressao_facial() {
		return expressao_facial;
	}

	public void setExpressao_facial(String expressao_facial) {
		this.expressao_facial = expressao_facial;
	}

	public String getPosicao_corporal() {
		return posicao_corporal;
	}

	public void setPosicao_corporal(String posicao_corporal) {
		this.posicao_corporal = posicao_corporal;
	}
}
