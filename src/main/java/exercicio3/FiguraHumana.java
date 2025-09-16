package exercicio3;

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

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getExpressao_facial() {
		return expressao_facial;
	}

	private void setExpressao_facial(String expressao_facial) {
		this.expressao_facial = expressao_facial;
	}

	private String getPosicao_corporal() {
		return posicao_corporal;
	}

	private void setPosicao_corporal(String posicao_corporal) {
		this.posicao_corporal = posicao_corporal;
	}
}
