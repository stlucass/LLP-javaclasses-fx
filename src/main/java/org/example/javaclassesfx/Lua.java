package org.example.javaclassesfx;

public class Lua {
	private String fase;
	private String iluminacao;
	private String influencia;

	public Lua(String fase, String iluminacao, String influencia) {
		this.fase = fase;
		this.iluminacao = iluminacao;
		this.influencia = influencia;
	}

	public void exercer_influencia() {
		System.out.println("Exercendo influência: " + influencia);
	}

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public String getIluminacao() {
		return iluminacao;
	}

	public void setIluminacao(String iluminacao) {
		this.iluminacao = iluminacao;
	}

	public String getInfluencia() {
		return influencia;
	}

	public void setInfluencia(String influencia) {
		this.influencia = influencia;
	}

}
