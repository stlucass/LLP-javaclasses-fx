package org.example.javaclassesfx;

public class Pele {
	private String sensibilidade;
	private double temperatura;
	private String textura;

	public Pele(String sensibilidade, double temperatura, String textura) {
		this.sensibilidade = sensibilidade;
		this.temperatura = temperatura;
		this.textura = textura;
	}

	public void sentir_toque() {
		System.out.println("Sentindo toque com sensibilidade: " + sensibilidade);
	}

	public String getSensibilidade() {
		return sensibilidade;
	}

	public void setSensibilidade(String sensibilidade) {
		this.sensibilidade = sensibilidade;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

}
